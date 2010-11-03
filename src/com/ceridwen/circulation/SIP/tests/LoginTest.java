/*******************************************************************************
 * Copyright (c) 2010 Matthew J. Dovey (www.ceridwen.com).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at 
 * <http://www.gnu.org/licenses/>
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contributors:
 *     Matthew J. Dovey (www.ceridwen.com) - initial API and implementation
 ******************************************************************************/
package com.ceridwen.circulation.SIP.tests;

import com.ceridwen.circulation.SIP.messages.Login;
import com.ceridwen.circulation.SIP.messages.Message;

public class LoginTest extends AbstractMessageTest<Login> {
	@Override
	public Message getDefaultMessage() {
		Login m = new Login();
		
		return m;	}

	@Override
	public String getDefaultEncoding() {
		return "93  CN|CO|";
	}

	@Override
	public Message getMessage() {
		Login m = new Login();
		
		m.setLocationCode("locationCode");
		m.setLoginPassword("loginPassword");
		m.setLoginUserId("loginUserId");
		m.setPWDAlgorithm("P");
		m.setUIDAlgorithm("U");

		return m;
	}

	@Override
	public String getEncoding() {
		return "93UPCNloginUserId|COloginPassword|CPlocationCode|";
	}
}

