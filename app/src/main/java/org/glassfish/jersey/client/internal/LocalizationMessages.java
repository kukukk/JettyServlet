package org.glassfish.jersey.client.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.client.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableCLIENT_INSTANCE_CLOSED()
  {
    return messageFactory.getMessage("client.instance.closed", new Object[0]);
  }
  
  public static String CLIENT_INSTANCE_CLOSED()
  {
    return localizer.localize(localizableCLIENT_INSTANCE_CLOSED());
  }
  
  public static Localizable localizableCLIENT_TARGET_LINK_NULL()
  {
    return messageFactory.getMessage("client.target.link.null", new Object[0]);
  }
  
  public static String CLIENT_TARGET_LINK_NULL()
  {
    return localizer.localize(localizableCLIENT_TARGET_LINK_NULL());
  }
  
  public static Localizable localizableERROR_HTTP_METHOD_ENTITY_NULL(Object arg0)
  {
    return messageFactory.getMessage("error.http.method.entity.null", new Object[] { arg0 });
  }
  
  public static String ERROR_HTTP_METHOD_ENTITY_NULL(Object arg0)
  {
    return localizer.localize(localizableERROR_HTTP_METHOD_ENTITY_NULL(arg0));
  }
  
  public static Localizable localizableCLIENT_RESPONSE_STATUS_NULL()
  {
    return messageFactory.getMessage("client.response.status.null", new Object[0]);
  }
  
  public static String CLIENT_RESPONSE_STATUS_NULL()
  {
    return localizer.localize(localizableCLIENT_RESPONSE_STATUS_NULL());
  }
  
  public static Localizable localizableCHUNKED_INPUT_STREAM_CLOSING_ERROR()
  {
    return messageFactory.getMessage("chunked.input.stream.closing.error", new Object[0]);
  }
  
  public static String CHUNKED_INPUT_STREAM_CLOSING_ERROR()
  {
    return localizer.localize(localizableCHUNKED_INPUT_STREAM_CLOSING_ERROR());
  }
  
  public static Localizable localizableIGNORED_ASYNC_THREADPOOL_SIZE(Object arg0)
  {
    return messageFactory.getMessage("ignored.async.threadpool.size", new Object[] { arg0 });
  }
  
  public static String IGNORED_ASYNC_THREADPOOL_SIZE(Object arg0)
  {
    return localizer.localize(localizableIGNORED_ASYNC_THREADPOOL_SIZE(arg0));
  }
  
  public static Localizable localizableCLIENT_URI_BUILDER_NULL()
  {
    return messageFactory.getMessage("client.uri.builder.null", new Object[0]);
  }
  
  public static String CLIENT_URI_BUILDER_NULL()
  {
    return localizer.localize(localizableCLIENT_URI_BUILDER_NULL());
  }
  
  public static Localizable localizableAUTHENTICATION_CREDENTIALS_REQUEST_PASSWORD_UNSUPPORTED()
  {
    return messageFactory.getMessage("authentication.credentials.request.password.unsupported", new Object[0]);
  }
  
  public static String AUTHENTICATION_CREDENTIALS_REQUEST_PASSWORD_UNSUPPORTED()
  {
    return localizer.localize(localizableAUTHENTICATION_CREDENTIALS_REQUEST_PASSWORD_UNSUPPORTED());
  }
  
  public static Localizable localizableERROR_REQUEST_CANCELLED()
  {
    return messageFactory.getMessage("error.request.cancelled", new Object[0]);
  }
  
  public static String ERROR_REQUEST_CANCELLED()
  {
    return localizer.localize(localizableERROR_REQUEST_CANCELLED());
  }
  
  public static Localizable localizableERROR_HTTP_METHOD_ENTITY_NOT_NULL(Object arg0)
  {
    return messageFactory.getMessage("error.http.method.entity.not.null", new Object[] { arg0 });
  }
  
  public static String ERROR_HTTP_METHOD_ENTITY_NOT_NULL(Object arg0)
  {
    return localizer.localize(localizableERROR_HTTP_METHOD_ENTITY_NOT_NULL(arg0));
  }
  
  public static Localizable localizableNULL_SSL_CONTEXT()
  {
    return messageFactory.getMessage("null.ssl.context", new Object[0]);
  }
  
  public static String NULL_SSL_CONTEXT()
  {
    return localizer.localize(localizableNULL_SSL_CONTEXT());
  }
  
  public static Localizable localizableERROR_LISTENER_CLOSE(Object arg0)
  {
    return messageFactory.getMessage("error.listener.close", new Object[] { arg0 });
  }
  
  public static String ERROR_LISTENER_CLOSE(Object arg0)
  {
    return localizer.localize(localizableERROR_LISTENER_CLOSE(arg0));
  }
  
  public static Localizable localizableHTTPURLCONNECTION_REPLACES_GET_WITH_ENTITY()
  {
    return messageFactory.getMessage("httpurlconnection.replaces.get.with.entity", new Object[0]);
  }
  
  public static String HTTPURLCONNECTION_REPLACES_GET_WITH_ENTITY()
  {
    return localizer.localize(localizableHTTPURLCONNECTION_REPLACES_GET_WITH_ENTITY());
  }
  
  public static Localizable localizableERROR_COMMITTING_OUTPUT_STREAM()
  {
    return messageFactory.getMessage("error.committing.output.stream", new Object[0]);
  }
  
  public static String ERROR_COMMITTING_OUTPUT_STREAM()
  {
    return localizer.localize(localizableERROR_COMMITTING_OUTPUT_STREAM());
  }
  
  public static Localizable localizableREQUEST_ENTITY_WRITER_NULL()
  {
    return messageFactory.getMessage("request.entity.writer.null", new Object[0]);
  }
  
  public static String REQUEST_ENTITY_WRITER_NULL()
  {
    return localizer.localize(localizableREQUEST_ENTITY_WRITER_NULL());
  }
  
  public static Localizable localizableUSING_FIXED_ASYNC_THREADPOOL(Object arg0)
  {
    return messageFactory.getMessage("using.fixed.async.threadpool", new Object[] { arg0 });
  }
  
  public static String USING_FIXED_ASYNC_THREADPOOL(Object arg0)
  {
    return localizer.localize(localizableUSING_FIXED_ASYNC_THREADPOOL(arg0));
  }
  
  public static Localizable localizableCLIENT_RESPONSE_RESOLVED_URI_NOT_ABSOLUTE()
  {
    return messageFactory.getMessage("client.response.resolved.uri.not.absolute", new Object[0]);
  }
  
  public static String CLIENT_RESPONSE_RESOLVED_URI_NOT_ABSOLUTE()
  {
    return localizer.localize(localizableCLIENT_RESPONSE_RESOLVED_URI_NOT_ABSOLUTE());
  }
  
  public static Localizable localizableREQUEST_ENTITY_ALREADY_WRITTEN()
  {
    return messageFactory.getMessage("request.entity.already.written", new Object[0]);
  }
  
  public static String REQUEST_ENTITY_ALREADY_WRITTEN()
  {
    return localizer.localize(localizableREQUEST_ENTITY_ALREADY_WRITTEN());
  }
  
  public static Localizable localizableCLIENT_URI_NULL()
  {
    return messageFactory.getMessage("client.uri.null", new Object[0]);
  }
  
  public static String CLIENT_URI_NULL()
  {
    return localizer.localize(localizableCLIENT_URI_NULL());
  }
  
  public static Localizable localizableAUTHENTICATION_CREDENTIALS_MISSING_DIGEST()
  {
    return messageFactory.getMessage("authentication.credentials.missing.digest", new Object[0]);
  }
  
  public static String AUTHENTICATION_CREDENTIALS_MISSING_DIGEST()
  {
    return localizer.localize(localizableAUTHENTICATION_CREDENTIALS_MISSING_DIGEST());
  }
  
  public static Localizable localizableCHUNKED_INPUT_CLOSED()
  {
    return messageFactory.getMessage("chunked.input.closed", new Object[0]);
  }
  
  public static String CHUNKED_INPUT_CLOSED()
  {
    return localizer.localize(localizableCHUNKED_INPUT_CLOSED());
  }
  
  public static Localizable localizableNULL_KEYSTORE()
  {
    return messageFactory.getMessage("null.keystore", new Object[0]);
  }
  
  public static String NULL_KEYSTORE()
  {
    return localizer.localize(localizableNULL_KEYSTORE());
  }
  
  public static Localizable localizableNEGATIVE_INPUT_PARAMETER(Object arg0)
  {
    return messageFactory.getMessage("negative.input.parameter", new Object[] { arg0 });
  }
  
  public static String NEGATIVE_INPUT_PARAMETER(Object arg0)
  {
    return localizer.localize(localizableNEGATIVE_INPUT_PARAMETER(arg0));
  }
  
  public static Localizable localizableDIGEST_FILTER_QOP_UNSUPPORTED(Object arg0)
  {
    return messageFactory.getMessage("digest.filter.qop.unsupported", new Object[] { arg0 });
  }
  
  public static String DIGEST_FILTER_QOP_UNSUPPORTED(Object arg0)
  {
    return localizer.localize(localizableDIGEST_FILTER_QOP_UNSUPPORTED(arg0));
  }
  
  public static Localizable localizableCHUNKED_INPUT_MEDIA_TYPE_NULL()
  {
    return messageFactory.getMessage("chunked.input.media.type.null", new Object[0]);
  }
  
  public static String CHUNKED_INPUT_MEDIA_TYPE_NULL()
  {
    return localizer.localize(localizableCHUNKED_INPUT_MEDIA_TYPE_NULL());
  }
  
  public static Localizable localizableAUTHENTICATION_CREDENTIALS_MISSING_BASIC()
  {
    return messageFactory.getMessage("authentication.credentials.missing.basic", new Object[0]);
  }
  
  public static String AUTHENTICATION_CREDENTIALS_MISSING_BASIC()
  {
    return localizer.localize(localizableAUTHENTICATION_CREDENTIALS_MISSING_BASIC());
  }
  
  public static Localizable localizableRESTRICTED_HEADER_POSSIBLY_IGNORED(Object arg0)
  {
    return messageFactory.getMessage("restricted.header.possibly.ignored", new Object[] { arg0 });
  }
  
  public static String RESTRICTED_HEADER_POSSIBLY_IGNORED(Object arg0)
  {
    return localizer.localize(localizableRESTRICTED_HEADER_POSSIBLY_IGNORED(arg0));
  }
  
  public static Localizable localizableERROR_SHUTDOWNHOOK_CLOSE(Object arg0)
  {
    return messageFactory.getMessage("error.shutdownhook.close", new Object[] { arg0 });
  }
  
  public static String ERROR_SHUTDOWNHOOK_CLOSE(Object arg0)
  {
    return localizer.localize(localizableERROR_SHUTDOWNHOOK_CLOSE(arg0));
  }
  
  public static Localizable localizableRESTRICTED_HEADER_PROPERTY_SETTING_TRUE(Object arg0)
  {
    return messageFactory.getMessage("restricted.header.property.setting.true", new Object[] { arg0 });
  }
  
  public static String RESTRICTED_HEADER_PROPERTY_SETTING_TRUE(Object arg0)
  {
    return localizer.localize(localizableRESTRICTED_HEADER_PROPERTY_SETTING_TRUE(arg0));
  }
  
  public static Localizable localizableNULL_TRUSTSTORE()
  {
    return messageFactory.getMessage("null.truststore", new Object[0]);
  }
  
  public static String NULL_TRUSTSTORE()
  {
    return localizer.localize(localizableNULL_TRUSTSTORE());
  }
  
  public static Localizable localizableERROR_CLOSING_OUTPUT_STREAM()
  {
    return messageFactory.getMessage("error.closing.output.stream", new Object[0]);
  }
  
  public static String ERROR_CLOSING_OUTPUT_STREAM()
  {
    return localizer.localize(localizableERROR_CLOSING_OUTPUT_STREAM());
  }
  
  public static Localizable localizableERROR_LISTENER_INIT(Object arg0)
  {
    return messageFactory.getMessage("error.listener.init", new Object[] { arg0 });
  }
  
  public static String ERROR_LISTENER_INIT(Object arg0)
  {
    return localizer.localize(localizableERROR_LISTENER_INIT(arg0));
  }
  
  public static Localizable localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_RESPONSE(Object arg0)
  {
    return messageFactory.getMessage("error.service.locator.provider.instance.response", new Object[] { arg0 });
  }
  
  public static String ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_RESPONSE(Object arg0)
  {
    return localizer.localize(localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_RESPONSE(arg0));
  }
  
  public static Localizable localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_REQUEST(Object arg0)
  {
    return messageFactory.getMessage("error.service.locator.provider.instance.request", new Object[] { arg0 });
  }
  
  public static String ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_REQUEST(Object arg0)
  {
    return localizer.localize(localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_REQUEST(arg0));
  }
  
  public static Localizable localizableUNEXPECTED_ERROR_RESPONSE_PROCESSING()
  {
    return messageFactory.getMessage("unexpected.error.response.processing", new Object[0]);
  }
  
  public static String UNEXPECTED_ERROR_RESPONSE_PROCESSING()
  {
    return localizer.localize(localizableUNEXPECTED_ERROR_RESPONSE_PROCESSING());
  }
  
  public static Localizable localizableRESPONSE_TO_EXCEPTION_CONVERSION_FAILED()
  {
    return messageFactory.getMessage("response.to.exception.conversion.failed", new Object[0]);
  }
  
  public static String RESPONSE_TO_EXCEPTION_CONVERSION_FAILED()
  {
    return localizer.localize(localizableRESPONSE_TO_EXCEPTION_CONVERSION_FAILED());
  }
  
  public static Localizable localizableNULL_KEYSTORE_PASWORD()
  {
    return messageFactory.getMessage("null.keystore.pasword", new Object[0]);
  }
  
  public static String NULL_KEYSTORE_PASWORD()
  {
    return localizer.localize(localizableNULL_KEYSTORE_PASWORD());
  }
  
  public static Localizable localizableCLIENT_URI_TEMPLATE_NULL()
  {
    return messageFactory.getMessage("client.uri.template.null", new Object[0]);
  }
  
  public static String CLIENT_URI_TEMPLATE_NULL()
  {
    return localizer.localize(localizableCLIENT_URI_TEMPLATE_NULL());
  }
  
  public static Localizable localizableCLIENT_RESPONSE_RESOLVED_URI_NULL()
  {
    return messageFactory.getMessage("client.response.resolved.uri.null", new Object[0]);
  }
  
  public static String CLIENT_RESPONSE_RESOLVED_URI_NULL()
  {
    return localizer.localize(localizableCLIENT_RESPONSE_RESOLVED_URI_NULL());
  }
  
  public static Localizable localizableCLIENT_INVOCATION_LINK_NULL()
  {
    return messageFactory.getMessage("client.invocation.link.null", new Object[0]);
  }
  
  public static String CLIENT_INVOCATION_LINK_NULL()
  {
    return localizer.localize(localizableCLIENT_INVOCATION_LINK_NULL());
  }
  
  public static Localizable localizableNULL_INPUT_PARAMETER(Object arg0)
  {
    return messageFactory.getMessage("null.input.parameter", new Object[] { arg0 });
  }
  
  public static String NULL_INPUT_PARAMETER(Object arg0)
  {
    return localizer.localize(localizableNULL_INPUT_PARAMETER(arg0));
  }
  
  public static Localizable localizableRESPONSE_TYPE_IS_NULL()
  {
    return messageFactory.getMessage("response.type.is.null", new Object[0]);
  }
  
  public static String RESPONSE_TYPE_IS_NULL()
  {
    return localizer.localize(localizableRESPONSE_TYPE_IS_NULL());
  }
  
  public static Localizable localizableUSE_ENCODING_IGNORED(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("use.encoding.ignored", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String USE_ENCODING_IGNORED(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableUSE_ENCODING_IGNORED(arg0, arg1, arg2));
  }
  
  public static Localizable localizableRESTRICTED_HEADER_PROPERTY_SETTING_FALSE(Object arg0)
  {
    return messageFactory.getMessage("restricted.header.property.setting.false", new Object[] { arg0 });
  }
  
  public static String RESTRICTED_HEADER_PROPERTY_SETTING_FALSE(Object arg0)
  {
    return localizer.localize(localizableRESTRICTED_HEADER_PROPERTY_SETTING_FALSE(arg0));
  }
  
  public static Localizable localizableNULL_CONNECTOR_PROVIDER()
  {
    return messageFactory.getMessage("null.connector.provider", new Object[0]);
  }
  
  public static String NULL_CONNECTOR_PROVIDER()
  {
    return localizer.localize(localizableNULL_CONNECTOR_PROVIDER());
  }
  
  public static Localizable localizableERROR_DIGEST_FILTER_GENERATOR()
  {
    return messageFactory.getMessage("error.digest.filter.generator", new Object[0]);
  }
  
  public static String ERROR_DIGEST_FILTER_GENERATOR()
  {
    return localizer.localize(localizableERROR_DIGEST_FILTER_GENERATOR());
  }
  
  public static Localizable localizableNEGATIVE_CHUNK_SIZE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("negative.chunk.size", new Object[] { arg0, arg1 });
  }
  
  public static String NEGATIVE_CHUNK_SIZE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableNEGATIVE_CHUNK_SIZE(arg0, arg1));
  }
}
