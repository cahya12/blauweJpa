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


//import org.primefaces.extensions.showcase.model.masterdetail.User;

import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.verdin.jsf.domain.User;

import java.io.Serializable;
import org.jboss.logging.Logger;

/**
 * WizardMasterDetailController.
 *
 * @author  Oleg Varaksin / last modified by $Author$
 * @version $Revision$
 */
//@ManagedBean
//@ViewScoped
@Named
@ViewScoped
public class WizardMasterDetailController implements Serializable {

	private static final long serialVersionUID = 20120209L;
	static Logger logger = Logger.getLogger(WizardMasterDetailController.class);

	private User user = new User();
	private int currentLevel = 1;

	public User getUser() {
		logger.info("getUser invoked ... user is "+ user.getLastname());

		return user;
	}

	public void setUser(User user) {
		logger.info("setUser invoked");

		this.user = user;
	}

	public int getCurrentLevel() {
		logger.info("getCurrentLevel invoked");

		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		logger.info("setCurrentLevel invoked");

		
		this.currentLevel = currentLevel;
	}

	public void save(ActionEvent actionEvent) {
		
		logger.info("save invoked");

		FacesMessage msg = new FacesMessage("Saved successful", "Welcome :" + user.getFirstname());
		FacesContext.getCurrentInstance().addMessage(null, msg);

		// create new empty user
		user = new User();
		currentLevel = 1;
	}
}