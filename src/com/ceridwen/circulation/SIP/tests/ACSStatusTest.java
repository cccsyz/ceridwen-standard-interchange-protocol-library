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

import com.ceridwen.circulation.SIP.messages.ACSStatus;
import com.ceridwen.circulation.SIP.messages.Message;
import com.ceridwen.circulation.SIP.types.enumerations.ProtocolVersion;
import com.ceridwen.circulation.SIP.types.flagfields.SupportedMessages;

public class ACSStatusTest extends AbstractMessageTest<ACSStatus> {
	@Override
	public Message getDefaultMessage() {
		ACSStatus m = new ACSStatus();

		m.setDateTimeSync(new java.util.Date(0));
		
		return m;
	}

	@Override
	public String getDefaultEncoding() {
		return "98NNNNNN00000019700101    0100002.00AO|BXNNNNNNNNNNNNNNNN|";
	}

	@Override
	public Message getMessage() {
		ACSStatus m = new ACSStatus();
		
		m.setCheckInOk(true);
		m.setCheckOutOk(true);
		m.setDateTimeSync(new java.util.Date(0));
		m.setInstitutionId("institutionId");
		m.setLibraryName("libraryName");
		m.setOfflineOk(true);
		m.setOnLineStatus(true);
		m.setPrintLine("printLine");
		m.setProtocolVersion(ProtocolVersion.VERSION_2_00);
		m.setRenewalPolicy(true);
		m.setRetriesAllowed(123);
		m.setScreenMessage("screenMessage"); 
		m.setStatusUpdateOk(true);
		m.getSupportedMessages().set(SupportedMessages.BLOCK_PATRON);
		m.getSupportedMessages().set(SupportedMessages.CHECK_IN);
		m.getSupportedMessages().set(SupportedMessages.CHECK_OUT);
		m.getSupportedMessages().set(SupportedMessages.END_PATRON_SESSION);
		m.getSupportedMessages().set(SupportedMessages.FEE_PAID);
		m.getSupportedMessages().set(SupportedMessages.HOLD);
		m.getSupportedMessages().set(SupportedMessages.ITEM_INFORMATION);
		m.getSupportedMessages().set(SupportedMessages.ITEM_STATUS_UPDATE);
		m.getSupportedMessages().set(SupportedMessages.LOGIN);
		m.getSupportedMessages().set(SupportedMessages.PATRON_ENABLE);
		m.getSupportedMessages().set(SupportedMessages.PATRON_INFORMATION);
		m.getSupportedMessages().set(SupportedMessages.PATRON_STATUS_REQUEST);
		m.getSupportedMessages().set(SupportedMessages.RENEW);
		m.getSupportedMessages().set(SupportedMessages.RENEW_ALL);
		m.getSupportedMessages().set(SupportedMessages.REQUEST_SC_ACS_RESEND);
		m.getSupportedMessages().set(SupportedMessages.SC_ACS_STATUS);
		m.setTerminalLocation("terminalLocation");
		m.setTimeoutPeriod(123);

		return m;
	}

	@Override
	public String getEncoding() {
		return "98YYYYYY12312319700101    0100002.00AFscreenMessage|AGprintLine|AMlibraryName|ANterminalLocation|AOinstitutionId|BXYYYYYYYYYYYYYYYY|";
	}

}

