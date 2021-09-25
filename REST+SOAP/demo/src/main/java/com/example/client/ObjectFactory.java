
package com.example.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the client package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeleteMatch_QNAME = new QName("http://Soap.example.com/", "DeleteMatch");
    private final static QName _DeleteMatchResponse_QNAME = new QName("http://Soap.example.com/",
            "DeleteMatchResponse");
    private final static QName _GetAllMatchesResponse_QNAME = new QName("http://Soap.example.com/",
            "GetAllMatchesResponse");
    private final static QName _GetMatchById_QNAME = new QName("http://Soap.example.com/", "GetMatchById");
    private final static QName _GetAllMatchesFilteredResponse_QNAME = new QName("http://Soap.example.com/",
            "GetAllMatchesFilteredResponse");
    private final static QName _UpdateMatch_QNAME = new QName("http://Soap.example.com/", "UpdateMatch");
    private final static QName _Exception_QNAME = new QName("http://Soap.example.com/", "Exception");
    private final static QName _AddMatch_QNAME = new QName("http://Soap.example.com/", "AddMatch");
    private final static QName _GetAllMatchesFiltered_QNAME = new QName("http://Soap.example.com/",
            "GetAllMatchesFiltered");
    private final static QName _UpdateMatchResponse_QNAME = new QName("http://Soap.example.com/",
            "UpdateMatchResponse");
    private final static QName _GetMatchByIdResponse_QNAME = new QName("http://Soap.example.com/",
            "GetMatchByIdResponse");
    private final static QName _GetAllMatches_QNAME = new QName("http://Soap.example.com/", "GetAllMatches");
    private final static QName _AddMatchResponse_QNAME = new QName("http://Soap.example.com/", "AddMatchResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema
     * derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllMatches }
     * 
     */
    public GetAllMatches createGetAllMatches() {
        return new GetAllMatches();
    }

    /**
     * Create an instance of {@link GetMatchByIdResponse }
     * 
     */
    public GetMatchByIdResponse createGetMatchByIdResponse() {
        return new GetMatchByIdResponse();
    }

    /**
     * Create an instance of {@link AddMatchResponse }
     * 
     */
    public AddMatchResponse createAddMatchResponse() {
        return new AddMatchResponse();
    }

    /**
     * Create an instance of {@link GetAllMatchesFilteredResponse }
     * 
     */
    public GetAllMatchesFilteredResponse createGetAllMatchesFilteredResponse() {
        return new GetAllMatchesFilteredResponse();
    }

    /**
     * Create an instance of {@link UpdateMatch }
     * 
     */
    public UpdateMatch createUpdateMatch() {
        return new UpdateMatch();
    }

    /**
     * Create an instance of {@link DeleteMatchResponse }
     * 
     */
    public DeleteMatchResponse createDeleteMatchResponse() {
        return new DeleteMatchResponse();
    }

    /**
     * Create an instance of {@link GetAllMatchesResponse }
     * 
     */
    public GetAllMatchesResponse createGetAllMatchesResponse() {
        return new GetAllMatchesResponse();
    }

    /**
     * Create an instance of {@link GetMatchById }
     * 
     */
    public GetMatchById createGetMatchById() {
        return new GetMatchById();
    }

    /**
     * Create an instance of {@link UpdateMatchResponse }
     * 
     */
    public UpdateMatchResponse createUpdateMatchResponse() {
        return new UpdateMatchResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link AddMatch }
     * 
     */
    public AddMatch createAddMatch() {
        return new AddMatch();
    }

    /**
     * Create an instance of {@link GetAllMatchesFiltered }
     * 
     */
    public GetAllMatchesFiltered createGetAllMatchesFiltered() {
        return new GetAllMatchesFiltered();
    }

    /**
     * Create an instance of {@link DeleteMatch }
     * 
     */
    public DeleteMatch createDeleteMatch() {
        return new DeleteMatch();
    }

    /**
     * Create an instance of {@link SoapResponse }
     * 
     */
    public SoapResponse createSoapResponse() {
        return new SoapResponse();
    }

    /**
     * Create an instance of {@link Match }
     * 
     */
    public Match createMatch() {
        return new Match();
    }

    /**
     * Create an instance of {@link FilterHelper }
     * 
     */
    public FilterHelper createFilterHelper() {
        return new FilterHelper();
    }

    /**
     * Create an instance of {@link MatchesPojo }
     * 
     */
    public MatchesPojo createMatchesPojo() {
        return new MatchesPojo();
    }

    /**
     * Create an instance of {@link MatchPojo }
     * 
     */
    public MatchPojo createMatchPojo() {
        return new MatchPojo();
    }

    /**
     * Create an instance of {@link MatchID }
     * 
     */
    public MatchID createMatchID() {
        return new MatchID();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMatch
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "DeleteMatch")
    public JAXBElement<DeleteMatch> createDeleteMatch(DeleteMatch value) {
        return new JAXBElement<DeleteMatch>(_DeleteMatch_QNAME, DeleteMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteMatchResponse
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "DeleteMatchResponse")
    public JAXBElement<DeleteMatchResponse> createDeleteMatchResponse(DeleteMatchResponse value) {
        return new JAXBElement<DeleteMatchResponse>(_DeleteMatchResponse_QNAME, DeleteMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetAllMatchesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetAllMatchesResponse")
    public JAXBElement<GetAllMatchesResponse> createGetAllMatchesResponse(GetAllMatchesResponse value) {
        return new JAXBElement<GetAllMatchesResponse>(_GetAllMatchesResponse_QNAME, GetAllMatchesResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMatchById
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetMatchById")
    public JAXBElement<GetMatchById> createGetMatchById(GetMatchById value) {
        return new JAXBElement<GetMatchById>(_GetMatchById_QNAME, GetMatchById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetAllMatchesFilteredResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetAllMatchesFilteredResponse")
    public JAXBElement<GetAllMatchesFilteredResponse> createGetAllMatchesFilteredResponse(
            GetAllMatchesFilteredResponse value) {
        return new JAXBElement<GetAllMatchesFilteredResponse>(_GetAllMatchesFilteredResponse_QNAME,
                GetAllMatchesFilteredResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMatch
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "UpdateMatch")
    public JAXBElement<UpdateMatch> createUpdateMatch(UpdateMatch value) {
        return new JAXBElement<UpdateMatch>(_UpdateMatch_QNAME, UpdateMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatch
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "AddMatch")
    public JAXBElement<AddMatch> createAddMatch(AddMatch value) {
        return new JAXBElement<AddMatch>(_AddMatch_QNAME, AddMatch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetAllMatchesFiltered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetAllMatchesFiltered")
    public JAXBElement<GetAllMatchesFiltered> createGetAllMatchesFiltered(GetAllMatchesFiltered value) {
        return new JAXBElement<GetAllMatchesFiltered>(_GetAllMatchesFiltered_QNAME, GetAllMatchesFiltered.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMatchResponse
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "UpdateMatchResponse")
    public JAXBElement<UpdateMatchResponse> createUpdateMatchResponse(UpdateMatchResponse value) {
        return new JAXBElement<UpdateMatchResponse>(_UpdateMatchResponse_QNAME, UpdateMatchResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement
     * }{@code <}{@link GetMatchByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetMatchByIdResponse")
    public JAXBElement<GetMatchByIdResponse> createGetMatchByIdResponse(GetMatchByIdResponse value) {
        return new JAXBElement<GetMatchByIdResponse>(_GetMatchByIdResponse_QNAME, GetMatchByIdResponse.class, null,
                value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMatches
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "GetAllMatches")
    public JAXBElement<GetAllMatches> createGetAllMatches(GetAllMatches value) {
        return new JAXBElement<GetAllMatches>(_GetAllMatches_QNAME, GetAllMatches.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMatchResponse
     * }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Soap.example.com/", name = "AddMatchResponse")
    public JAXBElement<AddMatchResponse> createAddMatchResponse(AddMatchResponse value) {
        return new JAXBElement<AddMatchResponse>(_AddMatchResponse_QNAME, AddMatchResponse.class, null, value);
    }

}
