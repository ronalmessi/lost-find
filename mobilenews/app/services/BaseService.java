package services;

import java.util.HashMap;
import java.util.Map;

import models.BaseModel;

/**
 * @author marco
 * 
 *         功能：将充血模型切分，使GenericModel及其子类仅负责状态，由BaseServcie 实现对数据操作
 */
abstract public class BaseService {

	public static final String KEY_ERR_MSG = "errorMsg";
	public static final String KEY_RESULT_DATA = "data";
	public static final String METHOD_INVOKE_SUCC = "methodInvokeSucc";

	protected Map<String, Object> getDefaultResult(boolean defaultOptState) {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put(METHOD_INVOKE_SUCC, defaultOptState);
		return result;
	}

	protected String getLogicDelSecuritySql(String originSql) {
		return BaseModel.getDefaultContitionSql(originSql);
	}

	protected String genLDSS(String originSql) {
		return this.getLogicDelSecuritySql(originSql);
	}

}
