package com.simple.common;

/**
 * @author xiaobianchen
 * @version 1.0 2016/4/13
 *
 * Http处理结果
 */
public interface HttpConstants {

    String SYSTEM_ERROR_MSG = "系统错误";

    String REQUEST_PARAMS_NULL = "请求参数为空";

    String SERVICE_RESPONSE_NULL = "服务端返回结果为空";

    // 服务端返回成功的标志
    String SERVICE_RESPONSE_SUCCESS_CODE = "AMS00000";

    // 服务端返回结果的标志
    String SERVICE_RESPONSE_RESULT_FLAG = "returnCode";

    // 服务端返回结果失败的标志
    String SERVICE_RESPONSE_RESULT_MSG = "errorMsg";

    // 返回给前段页面成功或失败的标志
    String RESPONSE_RESULT_FLAG_ISERROR = "isError";

    // 执行删除操作
    String OPERATION_TYPE_DELETE = "D";

    String ENUM_PATH = "com.mucfc.msm.enumeration.";

}
