package io.swagger.api;

import io.swagger.kafka.Kafka;
import io.swagger.model.ContractActionRequest;
import io.swagger.model.ContractRequest;
import io.swagger.model.ContractResponse;
import io.swagger.model.ContractsResponse;
import io.swagger.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-13T19:46:33.636Z[GMT]")
@RestController
public class ContractsApiController implements ContractsApi {

    private final String TOPIC_NAME = "contracts";

    private static final Logger log = LoggerFactory.getLogger(ContractsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private Kafka kafka;

    @org.springframework.beans.factory.annotation.Autowired
    public ContractsApiController(ObjectMapper objectMapper, HttpServletRequest request, Kafka kafka) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.kafka = kafka;
    }

    public ResponseEntity<ContractResponse> getContract(@Parameter(in = ParameterIn.PATH, description = "External identifier of the contract", required=true, schema=@Schema()) @PathVariable("contractRef") String contractRef) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractResponse>(objectMapper.readValue("{\n  \"ContractRequest\" : {\n    \"$ref\" : \"#/components/examples/ContractRequest\"\n  }\n}", ContractResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractResponse>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Void> patchContract(@Parameter(in = ParameterIn.PATH, description = "External identifier of the contract", required=true, schema=@Schema()) @PathVariable("contractRef") String contractRef,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ContractActionRequest body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<ContractResponse> postContract(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody ContractRequest body) {
            try {
                ResponseEntity<ContractResponse> res =  new ResponseEntity<ContractResponse>(objectMapper.readValue("{\n  \"ContractRequest\" : {\n    \"$ref\" : \"#/components/examples/ContractRequest\"\n  }\n}", ContractResponse.class), HttpStatus.CREATED);
                if (res.getStatusCode() == HttpStatus.CREATED) {
                    kafka.send(TOPIC_NAME, "Contract signed at " + body.getSignedAt() + " is " + body.getStatus());
                } else {
                    kafka.send(TOPIC_NAME, "Invoice creation failed");
                }
                return res;
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    public ResponseEntity<ContractsResponse> searchContracts(@Parameter(in = ParameterIn.QUERY, description = "External identifier of the subscriber" ,schema=@Schema()) @Valid @RequestParam(value = "subscriberRef", required = false) String subscriberRef,@Parameter(in = ParameterIn.QUERY, description = "Contract Status" ,schema=@Schema()) @Valid @RequestParam(value = "contractStatus", required = false) String contractStatus,@Parameter(in = ParameterIn.QUERY, description = "Limits the number of items on a page" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Specifies the page number of the list to be displayed" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContractsResponse>(objectMapper.readValue("{\n  \"ContractsResponse\" : {\n    \"$ref\" : \"#/components/examples/ContractsResponse\"\n  }\n}", ContractsResponse.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContractsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContractsResponse>(HttpStatus.NOT_FOUND);
    }

}
