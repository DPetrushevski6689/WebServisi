package com.example.Soap;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.example.Services.MatchService;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class SoapMatches {
    private MatchService matchService = new MatchService();

}
