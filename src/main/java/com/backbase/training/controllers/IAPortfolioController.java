package com.backbase.training.controllers;

import com.backbase.training.rest.model.InvestmentAccountPortfolio;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by deepak on 21/11/14.
 */
@Controller
public class IAPortfolioController {

@RequestMapping(value="/rest/portfolio/{accountID}", method = RequestMethod.GET)

    public @ResponseBody InvestmentAccountPortfolio getIAPortfoliobyID(@PathVariable("accountID") String accountID)
    {

        InvestmentAccountPortfolio portfolio=new InvestmentAccountPortfolio();
        portfolio.setAccountId(accountID);
        portfolio.setPerformanceAvailable(true);
        return portfolio;


    }
}
