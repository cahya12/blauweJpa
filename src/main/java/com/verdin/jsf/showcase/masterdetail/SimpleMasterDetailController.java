/*
 * Copyright 2011-2015 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Id$
 */

//package org.primefaces.extensions.showcase.controller.masterdetail;
package com.verdin.jsf.showcase.masterdetail;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.verdin.jsf.showcase.model.masterdetail.Country;
import com.verdin.jsf.showcase.model.masterdetail.League;
import com.verdin.jsf.showcase.model.masterdetail.Sport;
import org.jboss.logging.Logger;

//import org.primefaces.extensions.showcase.model.masterdetail.Country;
//import org.primefaces.extensions.showcase.model.masterdetail.League;
//import org.primefaces.extensions.showcase.model.masterdetail.Sport;

/**
 * SimpleMasterDetailController.
 *
 * @author  Oleg Varaksin / last modified by $Author$
 * @version $Revision$
 */
//@ManagedBean
//@ViewScoped
@Named
@ViewScoped
public class SimpleMasterDetailController implements Serializable {

	private static final long serialVersionUID = 20111120L;
	static Logger logger = Logger.getLogger(SimpleMasterDetailController.class);

	private List<Sport> sports;
	private int currentLevel = 1;

	public SimpleMasterDetailController() {
		logger.info("SimpleMasterDetailController invoked");
		
		if (sports == null) {
			sports = new ArrayList<Sport>();

			// football
			List<Country> countries = new ArrayList<Country>();
			Country country = new Country("Switzerland", "CH", "Football", getLeagues("Switzerland"));
			countries.add(country);
			country = new Country("England", "UK", "Football", getLeagues("England"));
			countries.add(country);
			country = new Country("Spain", "ES", "Football", getLeagues("Spain"));
			countries.add(country);
			country = new Country("Netherlands", "NL", "Football", getLeagues("Netherlands"));
			countries.add(country);
			sports.add(new Sport("Football", countries));

			//basketball
			countries = new ArrayList<Country>();
			country = new Country("Germany", "DE", "Basketball", getLeagues("Germany"));
			countries.add(country);
			country = new Country("USA", "US", "Basketball", getLeagues("USA"));
			countries.add(country);
			country = new Country("Poland", "PL", "Basketball", getLeagues("Poland"));
			countries.add(country);
			sports.add(new Sport("Basketball", countries));

			// ice hockey
			countries = new ArrayList<Country>();
			country = new Country("Russia", "RU", "Ice Hockey", getLeagues("Russia"));
			countries.add(country);
			country = new Country("Canada", "CA", "Ice Hockey", getLeagues("Canada"));
			countries.add(country);
			sports.add(new Sport("Ice Hockey", countries));
		}
	}

	public List<Sport> getSports() {
		
		logger.info("getSports invoked");
		
		return sports;
	}

	public int getCurrentLevel() {
		
		logger.info("getCurrentLevel invoked ... "+ this.currentLevel);
		
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		
		logger.info("setCurrentLevel invoked ... "+ this.currentLevel);
		logger.info("setCurrentLevel invoked ... "+ currentLevel);

		this.currentLevel = currentLevel;
	}

	private List<League> getLeagues(String country) {
		logger.info("getLeagues invoked");
		
		List<League> leagues = new ArrayList<League>();

		leagues.add(new League(country + " SuperLeague", 20));
		leagues.add(new League(country + " NotBadLeague", 15));
		leagues.add(new League(country + " CrapLeague", 30));

		return leagues;
	}
}
