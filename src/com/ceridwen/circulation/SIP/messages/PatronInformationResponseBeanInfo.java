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
package com.ceridwen.circulation.SIP.messages;

import java.beans.*;

import com.ceridwen.circulation.SIP.types.descriptors.PositionedFieldDescriptor;
import com.ceridwen.circulation.SIP.types.descriptors.TaggedFieldDescriptor;

/**
 * <p>Title: RTSI</p>
 * <p>Description: Real Time Self Issue</p>
 * <p>Copyright: </p>

 * @author Matthew J. Dovey
 * @version 1.0
 */

public class PatronInformationResponseBeanInfo extends MessageBeanInfo {
  Class<PatronInformationResponse> beanClass = PatronInformationResponse.class;
  public PatronInformationResponseBeanInfo() {
  }
  public PropertyDescriptor[] getPropertyDescriptorsInternal() throws IntrospectionException {
      PropertyDescriptor _chargedItems = new PropertyDescriptor("chargedItems", beanClass, "getChargedItems", "setChargedItems");
      PropertyDescriptor _chargedItemsCount = new PropertyDescriptor("chargedItemsCount", beanClass, "getChargedItemsCount", "setChargedItemsCount");
      PropertyDescriptor _chargedItemsLimit = new PropertyDescriptor("chargedItemsLimit", beanClass, "getChargedItemsLimit", "setChargedItemsLimit");
      PropertyDescriptor _currencyType = new PropertyDescriptor("currencyType", beanClass, "getCurrencyType", "setCurrencyType");
      PropertyDescriptor _eMailAddress = new PropertyDescriptor("eMailAddress", beanClass, "getEMailAddress", "setEMailAddress");
      PropertyDescriptor _feeAmount = new PropertyDescriptor("feeAmount", beanClass, "getFeeAmount", "setFeeAmount");
      PropertyDescriptor _feeLimit = new PropertyDescriptor("feeLimit", beanClass, "getFeeLimit", "setFeeLimit");
      PropertyDescriptor _fineItems = new PropertyDescriptor("fineItems", beanClass, "getFineItems", "setFineItems");
      PropertyDescriptor _fineItemsCount = new PropertyDescriptor("fineItemsCount", beanClass, "getFineItemsCount", "setFineItemsCount");
      PropertyDescriptor _holdItems = new PropertyDescriptor("holdItems", beanClass, "getHoldItems", "setHoldItems");
      PropertyDescriptor _holdItemsCount = new PropertyDescriptor("holdItemsCount", beanClass, "getHoldItemsCount", "setHoldItemsCount");
      PropertyDescriptor _holdItemsLimit = new PropertyDescriptor("holdItemsLimit", beanClass, "getHoldItemsLimit", "setHoldItemsLimit");
      PropertyDescriptor _homeAddress = new PropertyDescriptor("homeAddress", beanClass, "getHomeAddress", "setHomeAddress");
      PropertyDescriptor _homePhoneNumber = new PropertyDescriptor("homePhoneNumber", beanClass, "getHomePhoneNumber", "setHomePhoneNumber");
      PropertyDescriptor _institutionId = new PropertyDescriptor("institutionId", beanClass, "getInstitutionId", "setInstitutionId");
      PropertyDescriptor _language = new PropertyDescriptor("language", beanClass, "getLanguage", "setLanguage");
      PropertyDescriptor _overdueItems = new PropertyDescriptor("overdueItems", beanClass, "getOverdueItems", "setOverdueItems");
      PropertyDescriptor _overdueItemsCount = new PropertyDescriptor("overdueItemsCount", beanClass, "getOverdueItemsCount", "setOverdueItemsCount");
      PropertyDescriptor _overdueItemsLimit = new PropertyDescriptor("overdueItemsLimit", beanClass, "getOverdueItemsLimit", "setOverdueItemsLimit");
      PropertyDescriptor _patronIdentifier = new PropertyDescriptor("patronIdentifier", beanClass, "getPatronIdentifier", "setPatronIdentifier");
      PropertyDescriptor _patronStatus = new PropertyDescriptor("patronStatus", beanClass, "getPatronStatus", "setPatronStatus");
      PropertyDescriptor _personalName = new PropertyDescriptor("personalName", beanClass, "getPersonalName", "setPersonalName");
      PropertyDescriptor _printLine = new PropertyDescriptor("printLine", beanClass, "getPrintLine", "setPrintLine");
      PropertyDescriptor _recallItems = new PropertyDescriptor("recallItems", beanClass, "getRecallItems", "setRecallItems");
      PropertyDescriptor _recallItemsCount = new PropertyDescriptor("recallItemsCount", beanClass, "getRecallItemsCount", "setRecallItemsCount");
      PropertyDescriptor _screenMessage = new PropertyDescriptor("screenMessage", beanClass, "getScreenMessage", "setScreenMessage");
      PropertyDescriptor _transactionDate = new PropertyDescriptor("transactionDate", beanClass, "getTransactionDate", "setTransactionDate");
      PropertyDescriptor _unavailableHoldsCount = new PropertyDescriptor("unavailableHoldsCount", beanClass, "getUnavailableHoldsCount", "setUnavailableHoldsCount");
      PropertyDescriptor _unavailableHoldItems = new PropertyDescriptor("unavailableHoldItems", beanClass, "getUnavailableHoldItems", "setUnavailableHoldItems");
      PropertyDescriptor _validPatron = new PropertyDescriptor("validPatron", beanClass, "getValidPatron", "setValidPatron");
      PropertyDescriptor _validPatronPassword = new PropertyDescriptor("validPatronPassword", beanClass, "getValidPatronPassword", "setValidPatronPassword");

      _patronStatus.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(2,15));
      _language.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(16,18));
      _transactionDate.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(19,36));
      _holdItemsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(37,40));
      _overdueItemsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(41,44));
      _chargedItemsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(45,48));
      _fineItemsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(49,52));
      _recallItemsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(53,56));
      _unavailableHoldsCount.setValue("SIPFieldDescriptor", new PositionedFieldDescriptor(57,60));
      
      _currencyType.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
      _feeAmount.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(false));
      _patronIdentifier.setValue("SIPFieldDescriptor", new TaggedFieldDescriptor(true));
      

      PropertyDescriptor[] pds = new PropertyDescriptor[] {
        _chargedItems,
        _chargedItemsCount,
        _chargedItemsLimit,
        _currencyType,
        _eMailAddress,
        _feeAmount,
        _feeLimit,
        _fineItems,
        _fineItemsCount,
        _holdItems,
        _holdItemsCount,
        _holdItemsLimit,
        _homeAddress,
        _homePhoneNumber,
        _institutionId,
        _language,
        _overdueItems,
        _overdueItemsCount,
        _overdueItemsLimit,
        _patronIdentifier,
        _patronStatus,
        _personalName,
        _printLine,
        _recallItems,
        _recallItemsCount,
        _screenMessage,
        _transactionDate,
        _unavailableHoldsCount,
        _unavailableHoldItems,
        _validPatron,
        _validPatronPassword};
      return pds;
  }
}
