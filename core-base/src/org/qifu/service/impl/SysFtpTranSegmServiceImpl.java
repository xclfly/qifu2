/* 
 * Copyright 2012-2016 bambooCORE, greenstep of copyright Chen Xin Nien
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
 * 
 * -----------------------------------------------------------------------
 * 
 * author: 	Chen Xin Nien
 * contact: chen.xin.nien@gmail.com
 * 
 */
package org.qifu.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.qifu.base.dao.IBaseDAO;
import org.qifu.base.service.BaseService;
import org.qifu.dao.ISysFtpTranSegmDAO;
import org.qifu.po.TbSysFtpTranSegm;
import org.qifu.service.ISysFtpTranSegmService;
import org.qifu.vo.SysFtpTranSegmVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("core.service.SysFtpTranSegmService")
@Scope("prototype")
@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
public class SysFtpTranSegmServiceImpl extends BaseService<SysFtpTranSegmVO, TbSysFtpTranSegm, String> implements ISysFtpTranSegmService<SysFtpTranSegmVO, TbSysFtpTranSegm, String> {
	protected Logger logger=Logger.getLogger(SysFtpTranSegmServiceImpl.class);
	private ISysFtpTranSegmDAO<TbSysFtpTranSegm, String> sysFtpTranSegmDAO;
	
	public SysFtpTranSegmServiceImpl() {
		super();
	}

	public ISysFtpTranSegmDAO<TbSysFtpTranSegm, String> getSysFtpTranSegmDAO() {
		return sysFtpTranSegmDAO;
	}

	@Autowired
	@Resource(name="core.dao.SysFtpTranSegmDAO")
	@Required		
	public void setSysFtpTranSegmDAO(ISysFtpTranSegmDAO<TbSysFtpTranSegm, String> sysFtpTranSegmDAO) {
		this.sysFtpTranSegmDAO = sysFtpTranSegmDAO;
	}

	@Override
	protected IBaseDAO<TbSysFtpTranSegm, String> getBaseDataAccessObject() {
		return sysFtpTranSegmDAO;
	}

	@Override
	public String getMapperIdPo2Vo() {		
		return MAPPER_ID_PO2VO;
	}

	@Override
	public String getMapperIdVo2Po() {
		return MAPPER_ID_VO2PO;
	}

}
