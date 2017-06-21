
package trng.soap.service.loan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trng.soap.service.loan package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetLoanEligibility_QNAME = new QName("http://www.example.org/LoanEligibilityService/", "getLoanEligibility");
    private final static QName _GetLoanEligibilityResponse_QNAME = new QName("http://www.example.org/LoanEligibilityService/", "getLoanEligibilityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trng.soap.service.loan
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoanResponse }
     * 
     */
    public LoanResponse createLoanResponse() {
        return new LoanResponse();
    }

    /**
     * Create an instance of {@link NewOperation }
     * 
     */
    public NewOperation createNewOperation() {
        return new NewOperation();
    }

    /**
     * Create an instance of {@link NewOperationResponse }
     * 
     */
    public NewOperationResponse createNewOperationResponse() {
        return new NewOperationResponse();
    }

    /**
     * Create an instance of {@link LoanRequest }
     * 
     */
    public LoanRequest createLoanRequest() {
        return new LoanRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/LoanEligibilityService/", name = "getLoanEligibility")
    public JAXBElement<LoanRequest> createGetLoanEligibility(LoanRequest value) {
        return new JAXBElement<LoanRequest>(_GetLoanEligibility_QNAME, LoanRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoanResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/LoanEligibilityService/", name = "getLoanEligibilityResponse")
    public JAXBElement<LoanResponse> createGetLoanEligibilityResponse(LoanResponse value) {
        return new JAXBElement<LoanResponse>(_GetLoanEligibilityResponse_QNAME, LoanResponse.class, null, value);
    }

}
