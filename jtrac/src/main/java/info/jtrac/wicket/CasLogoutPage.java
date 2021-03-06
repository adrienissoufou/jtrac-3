/*
 * Copyright 2002-2005 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package info.jtrac.wicket;

import info.jtrac.wicket.yui.*;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.target.basic.RedirectRequestTarget;

/**
 * only used in case acegi - cas authentication is being used
 * then will force redirect to configured cas logout page url
 * see JtracApplication.java for more details
 */
public class CasLogoutPage extends WebPage {
    
    public CasLogoutPage() {
        String logoutUrl = ((JtracApplication) getApplication()).getCasLogoutUrl();
        getRequestCycle().setRequestTarget(new RedirectRequestTarget(logoutUrl));
    }
    
}
