
package mailClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mailClient package. 
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

    private final static QName _VaildateEmailResponse_QNAME = new QName("http://MailWebSer/", "vaildateEmailResponse");
    private final static QName _SendEmailBatch_QNAME = new QName("http://MailWebSer/", "sendEmailBatch");
    private final static QName _SendEmailBatchResponse_QNAME = new QName("http://MailWebSer/", "sendEmailBatchResponse");
    private final static QName _SendEmail_QNAME = new QName("http://MailWebSer/", "sendEmail");
    private final static QName _VaildateEmail_QNAME = new QName("http://MailWebSer/", "vaildateEmail");
    private final static QName _SendEmailResponse_QNAME = new QName("http://MailWebSer/", "sendEmailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mailClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link VaildateEmail }
     * 
     */
    public VaildateEmail createVaildateEmail() {
        return new VaildateEmail();
    }

    /**
     * Create an instance of {@link VaildateEmailResponse }
     * 
     */
    public VaildateEmailResponse createVaildateEmailResponse() {
        return new VaildateEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatchResponse }
     * 
     */
    public SendEmailBatchResponse createSendEmailBatchResponse() {
        return new SendEmailBatchResponse();
    }

    /**
     * Create an instance of {@link SendEmailBatch }
     * 
     */
    public SendEmailBatch createSendEmailBatch() {
        return new SendEmailBatch();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaildateEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "vaildateEmailResponse")
    public JAXBElement<VaildateEmailResponse> createVaildateEmailResponse(VaildateEmailResponse value) {
        return new JAXBElement<VaildateEmailResponse>(_VaildateEmailResponse_QNAME, VaildateEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "sendEmailBatch")
    public JAXBElement<SendEmailBatch> createSendEmailBatch(SendEmailBatch value) {
        return new JAXBElement<SendEmailBatch>(_SendEmailBatch_QNAME, SendEmailBatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailBatchResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "sendEmailBatchResponse")
    public JAXBElement<SendEmailBatchResponse> createSendEmailBatchResponse(SendEmailBatchResponse value) {
        return new JAXBElement<SendEmailBatchResponse>(_SendEmailBatchResponse_QNAME, SendEmailBatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "sendEmail")
    public JAXBElement<SendEmail> createSendEmail(SendEmail value) {
        return new JAXBElement<SendEmail>(_SendEmail_QNAME, SendEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VaildateEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "vaildateEmail")
    public JAXBElement<VaildateEmail> createVaildateEmail(VaildateEmail value) {
        return new JAXBElement<VaildateEmail>(_VaildateEmail_QNAME, VaildateEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://MailWebSer/", name = "sendEmailResponse")
    public JAXBElement<SendEmailResponse> createSendEmailResponse(SendEmailResponse value) {
        return new JAXBElement<SendEmailResponse>(_SendEmailResponse_QNAME, SendEmailResponse.class, null, value);
    }

}
