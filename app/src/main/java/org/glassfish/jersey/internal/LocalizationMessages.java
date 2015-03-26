package org.glassfish.jersey.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableERRORS_AND_WARNINGS_DETECTED(Object arg0)
  {
    return messageFactory.getMessage("errors.and.warnings.detected", new Object[] { arg0 });
  }
  
  public static String ERRORS_AND_WARNINGS_DETECTED(Object arg0)
  {
    return localizer.localize(localizableERRORS_AND_WARNINGS_DETECTED(arg0));
  }
  
  public static Localizable localizableCOMMITTING_STREAM_BUFFERING_ILLEGAL_STATE()
  {
    return messageFactory.getMessage("committing.stream.buffering.illegal.state", new Object[0]);
  }
  
  public static String COMMITTING_STREAM_BUFFERING_ILLEGAL_STATE()
  {
    return localizer.localize(localizableCOMMITTING_STREAM_BUFFERING_ILLEGAL_STATE());
  }
  
  public static Localizable localizableLOCALE_IS_NULL()
  {
    return messageFactory.getMessage("locale.is.null", new Object[0]);
  }
  
  public static String LOCALE_IS_NULL()
  {
    return localizer.localize(localizableLOCALE_IS_NULL());
  }
  
  public static Localizable localizableSSL_KMF_PROVIDER_NOT_REGISTERED()
  {
    return messageFactory.getMessage("ssl.kmf.provider.not.registered", new Object[0]);
  }
  
  public static String SSL_KMF_PROVIDER_NOT_REGISTERED()
  {
    return localizer.localize(localizableSSL_KMF_PROVIDER_NOT_REGISTERED());
  }
  
  public static Localizable localizableURI_COMPONENT_ENCODED_OCTET_INVALID_DIGIT(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.component.encoded.octet.invalid.digit", new Object[] { arg0, arg1 });
  }
  
  public static String URI_COMPONENT_ENCODED_OCTET_INVALID_DIGIT(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_COMPONENT_ENCODED_OCTET_INVALID_DIGIT(arg0, arg1));
  }
  
  public static Localizable localizableURI_PARSER_COMPONENT_DELIMITER(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.parser.component.delimiter", new Object[] { arg0, arg1 });
  }
  
  public static String URI_PARSER_COMPONENT_DELIMITER(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_PARSER_COMPONENT_DELIMITER(arg0, arg1));
  }
  
  public static Localizable localizableHK_2_REIFICATION_ERROR(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("hk2.reification.error", new Object[] { arg0, arg1 });
  }
  
  public static String HK_2_REIFICATION_ERROR(Object arg0, Object arg1)
  {
    return localizer.localize(localizableHK_2_REIFICATION_ERROR(arg0, arg1));
  }
  
  public static Localizable localizableURI_INFO_WAS_ALREADY_SET()
  {
    return messageFactory.getMessage("uri.info.was.already.set", new Object[0]);
  }
  
  public static String URI_INFO_WAS_ALREADY_SET()
  {
    return localizer.localize(localizableURI_INFO_WAS_ALREADY_SET());
  }
  
  public static Localizable localizableSSL_KMF_ALGORITHM_NOT_SUPPORTED()
  {
    return messageFactory.getMessage("ssl.kmf.algorithm.not.supported", new Object[0]);
  }
  
  public static String SSL_KMF_ALGORITHM_NOT_SUPPORTED()
  {
    return localizer.localize(localizableSSL_KMF_ALGORITHM_NOT_SUPPORTED());
  }
  
  public static Localizable localizableERROR_MBR_ISREADABLE(Object arg0)
  {
    return messageFactory.getMessage("error.mbr.isreadable", new Object[] { arg0 });
  }
  
  public static String ERROR_MBR_ISREADABLE(Object arg0)
  {
    return localizer.localize(localizableERROR_MBR_ISREADABLE(arg0));
  }
  
  public static Localizable localizableSSL_KMF_INIT_FAILED()
  {
    return messageFactory.getMessage("ssl.kmf.init.failed", new Object[0]);
  }
  
  public static String SSL_KMF_INIT_FAILED()
  {
    return localizer.localize(localizableSSL_KMF_INIT_FAILED());
  }
  
  public static Localizable localizableOVERRIDING_METHOD_CANNOT_BE_FOUND(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("overriding.method.cannot.be.found", new Object[] { arg0, arg1 });
  }
  
  public static String OVERRIDING_METHOD_CANNOT_BE_FOUND(Object arg0, Object arg1)
  {
    return localizer.localize(localizableOVERRIDING_METHOD_CANNOT_BE_FOUND(arg0, arg1));
  }
  
  public static Localizable localizableERROR_INTERCEPTOR_READER_PROCEED()
  {
    return messageFactory.getMessage("error.interceptor.reader.proceed", new Object[0]);
  }
  
  public static String ERROR_INTERCEPTOR_READER_PROCEED()
  {
    return localizer.localize(localizableERROR_INTERCEPTOR_READER_PROCEED());
  }
  
  public static Localizable localizableMEDIA_TYPE_IS_NULL()
  {
    return messageFactory.getMessage("media.type.is.null", new Object[0]);
  }
  
  public static String MEDIA_TYPE_IS_NULL()
  {
    return localizer.localize(localizableMEDIA_TYPE_IS_NULL());
  }
  
  public static Localizable localizableURI_COMPONENT_ENCODED_OCTET_MALFORMED(Object arg0)
  {
    return messageFactory.getMessage("uri.component.encoded.octet.malformed", new Object[] { arg0 });
  }
  
  public static String URI_COMPONENT_ENCODED_OCTET_MALFORMED(Object arg0)
  {
    return localizer.localize(localizableURI_COMPONENT_ENCODED_OCTET_MALFORMED(arg0));
  }
  
  public static Localizable localizableSSL_KS_INTEGRITY_ALGORITHM_NOT_FOUND()
  {
    return messageFactory.getMessage("ssl.ks.integrity.algorithm.not.found", new Object[0]);
  }
  
  public static String SSL_KS_INTEGRITY_ALGORITHM_NOT_FOUND()
  {
    return localizer.localize(localizableSSL_KS_INTEGRITY_ALGORITHM_NOT_FOUND());
  }
  
  public static Localizable localizableMESSAGE_CONTENT_BUFFER_RESET_FAILED()
  {
    return messageFactory.getMessage("message.content.buffer.reset.failed", new Object[0]);
  }
  
  public static String MESSAGE_CONTENT_BUFFER_RESET_FAILED()
  {
    return localizer.localize(localizableMESSAGE_CONTENT_BUFFER_RESET_FAILED());
  }
  
  public static Localizable localizableTEMPLATE_PARAM_NULL()
  {
    return messageFactory.getMessage("template.param.null", new Object[0]);
  }
  
  public static String TEMPLATE_PARAM_NULL()
  {
    return localizer.localize(localizableTEMPLATE_PARAM_NULL());
  }
  
  public static Localizable localizableSSL_TMF_INIT_FAILED()
  {
    return messageFactory.getMessage("ssl.tmf.init.failed", new Object[0]);
  }
  
  public static String SSL_TMF_INIT_FAILED()
  {
    return localizer.localize(localizableSSL_TMF_INIT_FAILED());
  }
  
  public static Localizable localizableURI_BUILDER_PATH_SEGMENT_NULL()
  {
    return messageFactory.getMessage("uri.builder.path.segment.null", new Object[0]);
  }
  
  public static String URI_BUILDER_PATH_SEGMENT_NULL()
  {
    return localizer.localize(localizableURI_BUILDER_PATH_SEGMENT_NULL());
  }
  
  public static Localizable localizableURI_BUILDER_CLASS_PATH_ANNOTATION_MISSING(Object arg0)
  {
    return messageFactory.getMessage("uri.builder.class.path.annotation.missing", new Object[] { arg0 });
  }
  
  public static String URI_BUILDER_CLASS_PATH_ANNOTATION_MISSING(Object arg0)
  {
    return localizer.localize(localizableURI_BUILDER_CLASS_PATH_ANNOTATION_MISSING(arg0));
  }
  
  public static Localizable localizableUNHANDLED_EXCEPTION_DETECTED(Object arg0)
  {
    return messageFactory.getMessage("unhandled.exception.detected", new Object[] { arg0 });
  }
  
  public static String UNHANDLED_EXCEPTION_DETECTED(Object arg0)
  {
    return localizer.localize(localizableUNHANDLED_EXCEPTION_DETECTED(arg0));
  }
  
  public static Localizable localizableNOT_SUPPORTED_ON_OUTBOUND_MESSAGE()
  {
    return messageFactory.getMessage("not.supported.on.outbound.message", new Object[0]);
  }
  
  public static String NOT_SUPPORTED_ON_OUTBOUND_MESSAGE()
  {
    return localizer.localize(localizableNOT_SUPPORTED_ON_OUTBOUND_MESSAGE());
  }
  
  public static Localizable localizableUNABLE_TO_PARSE_HEADER_VALUE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("unable.to.parse.header.value", new Object[] { arg0, arg1 });
  }
  
  public static String UNABLE_TO_PARSE_HEADER_VALUE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableUNABLE_TO_PARSE_HEADER_VALUE(arg0, arg1));
  }
  
  public static Localizable localizableERROR_PROVIDER_CONSTRAINED_TO_WRONG_RUNTIME(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.provider.constrainedTo.wrong.runtime", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_PROVIDER_CONSTRAINED_TO_WRONG_RUNTIME(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_PROVIDER_CONSTRAINED_TO_WRONG_RUNTIME(arg0, arg1, arg2));
  }
  
  public static Localizable localizableSSL_KMF_NO_PASSWORD_SET(Object arg0)
  {
    return messageFactory.getMessage("ssl.kmf.no.password.set", new Object[] { arg0 });
  }
  
  public static String SSL_KMF_NO_PASSWORD_SET(Object arg0)
  {
    return localizer.localize(localizableSSL_KMF_NO_PASSWORD_SET(arg0));
  }
  
  public static Localizable localizablePARAM_NULL(Object arg0)
  {
    return messageFactory.getMessage("param.null", new Object[] { arg0 });
  }
  
  public static String PARAM_NULL(Object arg0)
  {
    return localizer.localize(localizablePARAM_NULL(arg0));
  }
  
  public static Localizable localizableHTTP_HEADER_UNBALANCED_QUOTED()
  {
    return messageFactory.getMessage("http.header.unbalanced.quoted", new Object[0]);
  }
  
  public static String HTTP_HEADER_UNBALANCED_QUOTED()
  {
    return localizer.localize(localizableHTTP_HEADER_UNBALANCED_QUOTED());
  }
  
  public static Localizable localizableLINK_IS_NULL()
  {
    return messageFactory.getMessage("link.is.null", new Object[0]);
  }
  
  public static String LINK_IS_NULL()
  {
    return localizer.localize(localizableLINK_IS_NULL());
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_PART_OF_NAME(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.template.parser.illegal.char.partOf.name", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_PART_OF_NAME(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_PART_OF_NAME(arg0, arg1, arg2));
  }
  
  public static Localizable localizableREQUEST_SUSPEND_FAILED(Object arg0)
  {
    return messageFactory.getMessage("request.suspend.failed", new Object[] { arg0 });
  }
  
  public static String REQUEST_SUSPEND_FAILED(Object arg0)
  {
    return localizer.localize(localizableREQUEST_SUSPEND_FAILED(arg0));
  }
  
  public static Localizable localizablePROPERTIES_HELPER_DEPRECATED_PROPERTY_NAME(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("properties.helper.deprecated.property.name", new Object[] { arg0, arg1 });
  }
  
  public static String PROPERTIES_HELPER_DEPRECATED_PROPERTY_NAME(Object arg0, Object arg1)
  {
    return localizer.localize(localizablePROPERTIES_HELPER_DEPRECATED_PROPERTY_NAME(arg0, arg1));
  }
  
  public static Localizable localizableCOMPONENT_CANNOT_BE_NULL()
  {
    return messageFactory.getMessage("component.cannot.be.null", new Object[0]);
  }
  
  public static String COMPONENT_CANNOT_BE_NULL()
  {
    return localizer.localize(localizableCOMPONENT_CANNOT_BE_NULL());
  }
  
  public static Localizable localizableURI_BUILDER_ANNOTATEDELEMENT_PATH_ANNOTATION_MISSING(Object arg0)
  {
    return messageFactory.getMessage("uri.builder.annotatedelement.path.annotation.missing", new Object[] { arg0 });
  }
  
  public static String URI_BUILDER_ANNOTATEDELEMENT_PATH_ANNOTATION_MISSING(Object arg0)
  {
    return localizer.localize(localizableURI_BUILDER_ANNOTATEDELEMENT_PATH_ANNOTATION_MISSING(arg0));
  }
  
  public static Localizable localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_CONTEXT(Object arg0)
  {
    return messageFactory.getMessage("error.service.locator.provider.instance.feature.context", new Object[] { arg0 });
  }
  
  public static String ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_CONTEXT(Object arg0)
  {
    return localizer.localize(localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_CONTEXT(arg0));
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_START_NAME(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.template.parser.illegal.char.start.name", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_START_NAME(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_START_NAME(arg0, arg1, arg2));
  }
  
  public static Localizable localizableCONFIGURATION_NOT_MODIFIABLE()
  {
    return messageFactory.getMessage("configuration.not.modifiable", new Object[0]);
  }
  
  public static String CONFIGURATION_NOT_MODIFIABLE()
  {
    return localizer.localize(localizableCONFIGURATION_NOT_MODIFIABLE());
  }
  
  public static Localizable localizableSSL_TS_CERT_LOAD_ERROR()
  {
    return messageFactory.getMessage("ssl.ts.cert.load.error", new Object[0]);
  }
  
  public static String SSL_TS_CERT_LOAD_ERROR()
  {
    return localizer.localize(localizableSSL_TS_CERT_LOAD_ERROR());
  }
  
  public static Localizable localizableERROR_FINDING_EXCEPTION_MAPPER_TYPE(Object arg0)
  {
    return messageFactory.getMessage("error.finding.exception.mapper.type", new Object[] { arg0 });
  }
  
  public static String ERROR_FINDING_EXCEPTION_MAPPER_TYPE(Object arg0)
  {
    return localizer.localize(localizableERROR_FINDING_EXCEPTION_MAPPER_TYPE(arg0));
  }
  
  public static Localizable localizableERROR_NEWCOOKIE_EXPIRES(Object arg0)
  {
    return messageFactory.getMessage("error.newcookie.expires", new Object[] { arg0 });
  }
  
  public static String ERROR_NEWCOOKIE_EXPIRES(Object arg0)
  {
    return localizer.localize(localizableERROR_NEWCOOKIE_EXPIRES(arg0));
  }
  
  public static Localizable localizableILLEGAL_INITIAL_CAPACITY(Object arg0)
  {
    return messageFactory.getMessage("illegal.initial.capacity", new Object[] { arg0 });
  }
  
  public static String ILLEGAL_INITIAL_CAPACITY(Object arg0)
  {
    return localizer.localize(localizableILLEGAL_INITIAL_CAPACITY(arg0));
  }
  
  public static Localizable localizableSSL_KS_CERT_LOAD_ERROR()
  {
    return messageFactory.getMessage("ssl.ks.cert.load.error", new Object[0]);
  }
  
  public static String SSL_KS_CERT_LOAD_ERROR()
  {
    return localizer.localize(localizableSSL_KS_CERT_LOAD_ERROR());
  }
  
  public static Localizable localizableERROR_READING_ENTITY_FROM_INPUT_STREAM()
  {
    return messageFactory.getMessage("error.reading.entity.from.input.stream", new Object[0]);
  }
  
  public static String ERROR_READING_ENTITY_FROM_INPUT_STREAM()
  {
    return localizer.localize(localizableERROR_READING_ENTITY_FROM_INPUT_STREAM());
  }
  
  public static Localizable localizableERROR_PROVIDER_CONSTRAINED_TO_IGNORED(Object arg0)
  {
    return messageFactory.getMessage("error.provider.constrainedTo.ignored", new Object[] { arg0 });
  }
  
  public static String ERROR_PROVIDER_CONSTRAINED_TO_IGNORED(Object arg0)
  {
    return localizer.localize(localizableERROR_PROVIDER_CONSTRAINED_TO_IGNORED(arg0));
  }
  
  public static Localizable localizableHTTP_HEADER_WHITESPACE_NOT_ALLOWED()
  {
    return messageFactory.getMessage("http.header.whitespace.not.allowed", new Object[0]);
  }
  
  public static String HTTP_HEADER_WHITESPACE_NOT_ALLOWED()
  {
    return localizer.localize(localizableHTTP_HEADER_WHITESPACE_NOT_ALLOWED());
  }
  
  public static Localizable localizableILLEGAL_CONFIG_SYNTAX()
  {
    return messageFactory.getMessage("illegal.config.syntax", new Object[0]);
  }
  
  public static String ILLEGAL_CONFIG_SYNTAX()
  {
    return localizer.localize(localizableILLEGAL_CONFIG_SYNTAX());
  }
  
  public static Localizable localizableSSL_TS_FILE_NOT_FOUND(Object arg0)
  {
    return messageFactory.getMessage("ssl.ts.file.not.found", new Object[] { arg0 });
  }
  
  public static String SSL_TS_FILE_NOT_FOUND(Object arg0)
  {
    return localizer.localize(localizableSSL_TS_FILE_NOT_FOUND(arg0));
  }
  
  public static Localizable localizableERROR_CAUGHT_WHILE_LOADING_SPI_PROVIDERS()
  {
    return messageFactory.getMessage("error.caught.while.loading.spi.providers", new Object[0]);
  }
  
  public static String ERROR_CAUGHT_WHILE_LOADING_SPI_PROVIDERS()
  {
    return localizer.localize(localizableERROR_CAUGHT_WHILE_LOADING_SPI_PROVIDERS());
  }
  
  public static Localizable localizableMULTIPLE_MATCHING_CONSTRUCTORS_FOUND(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return messageFactory.getMessage("multiple.matching.constructors.found", new Object[] { arg0, arg1, arg2, arg3 });
  }
  
  public static String MULTIPLE_MATCHING_CONSTRUCTORS_FOUND(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return localizer.localize(localizableMULTIPLE_MATCHING_CONSTRUCTORS_FOUND(arg0, arg1, arg2, arg3));
  }
  
  public static Localizable localizableMETHOD_NOT_GETTER_NOR_SETTER()
  {
    return messageFactory.getMessage("method.not.getter.nor.setter", new Object[0]);
  }
  
  public static String METHOD_NOT_GETTER_NOR_SETTER()
  {
    return localizer.localize(localizableMETHOD_NOT_GETTER_NOR_SETTER());
  }
  
  public static Localizable localizableERROR_PARSING_ENTITY_TAG(Object arg0)
  {
    return messageFactory.getMessage("error.parsing.entity.tag", new Object[] { arg0 });
  }
  
  public static String ERROR_PARSING_ENTITY_TAG(Object arg0)
  {
    return localizer.localize(localizableERROR_PARSING_ENTITY_TAG(arg0));
  }
  
  public static Localizable localizableSSL_CTX_ALGORITHM_NOT_SUPPORTED()
  {
    return messageFactory.getMessage("ssl.ctx.algorithm.not.supported", new Object[0]);
  }
  
  public static String SSL_CTX_ALGORITHM_NOT_SUPPORTED()
  {
    return localizer.localize(localizableSSL_CTX_ALGORITHM_NOT_SUPPORTED());
  }
  
  public static Localizable localizableHK_2_UNKNOWN_ERROR(Object arg0)
  {
    return messageFactory.getMessage("hk2.unknown.error", new Object[] { arg0 });
  }
  
  public static String HK_2_UNKNOWN_ERROR(Object arg0)
  {
    return localizer.localize(localizableHK_2_UNKNOWN_ERROR(arg0));
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_AFTER_NAME(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.template.parser.illegal.char.after.name", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_AFTER_NAME(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_ILLEGAL_CHAR_AFTER_NAME(arg0, arg1, arg2));
  }
  
  public static Localizable localizableIGNORED_CUSTOM_REQUEST_EXECUTOR_PROVIDERS(Object arg0)
  {
    return messageFactory.getMessage("ignored.custom.request.executor.providers", new Object[] { arg0 });
  }
  
  public static String IGNORED_CUSTOM_REQUEST_EXECUTOR_PROVIDERS(Object arg0)
  {
    return localizer.localize(localizableIGNORED_CUSTOM_REQUEST_EXECUTOR_PROVIDERS(arg0));
  }
  
  public static Localizable localizableUSING_CUSTOM_REQUEST_EXECUTOR_PROVIDER(Object arg0)
  {
    return messageFactory.getMessage("using.custom.request.executor.provider", new Object[] { arg0 });
  }
  
  public static String USING_CUSTOM_REQUEST_EXECUTOR_PROVIDER(Object arg0)
  {
    return localizer.localize(localizableUSING_CUSTOM_REQUEST_EXECUTOR_PROVIDER(arg0));
  }
  
  public static Localizable localizableOUTPUT_STREAM_CLOSED()
  {
    return messageFactory.getMessage("output.stream.closed", new Object[0]);
  }
  
  public static String OUTPUT_STREAM_CLOSED()
  {
    return localizer.localize(localizableOUTPUT_STREAM_CLOSED());
  }
  
  public static Localizable localizableENTITY_TAG_IS_NULL()
  {
    return messageFactory.getMessage("entity.tag.is.null", new Object[0]);
  }
  
  public static String ENTITY_TAG_IS_NULL()
  {
    return localizer.localize(localizableENTITY_TAG_IS_NULL());
  }
  
  public static Localizable localizableINPUT_STREAM_CLOSED()
  {
    return messageFactory.getMessage("input.stream.closed", new Object[0]);
  }
  
  public static String INPUT_STREAM_CLOSED()
  {
    return localizer.localize(localizableINPUT_STREAM_CLOSED());
  }
  
  public static Localizable localizableCOOKIE_IS_NULL()
  {
    return messageFactory.getMessage("cookie.is.null", new Object[0]);
  }
  
  public static String COOKIE_IS_NULL()
  {
    return localizer.localize(localizableCOOKIE_IS_NULL());
  }
  
  public static Localizable localizableNEW_COOKIE_IS_NULL()
  {
    return messageFactory.getMessage("new.cookie.is.null", new Object[0]);
  }
  
  public static String NEW_COOKIE_IS_NULL()
  {
    return localizer.localize(localizableNEW_COOKIE_IS_NULL());
  }
  
  public static Localizable localizableINJECTION_ERROR_LOCAL_CLASS_NOT_SUPPORTED(Object arg0)
  {
    return messageFactory.getMessage("injection.error.local.class.not.supported", new Object[] { arg0 });
  }
  
  public static String INJECTION_ERROR_LOCAL_CLASS_NOT_SUPPORTED(Object arg0)
  {
    return localizer.localize(localizableINJECTION_ERROR_LOCAL_CLASS_NOT_SUPPORTED(arg0));
  }
  
  public static Localizable localizableSSL_TS_PROVIDERS_NOT_REGISTERED()
  {
    return messageFactory.getMessage("ssl.ts.providers.not.registered", new Object[0]);
  }
  
  public static String SSL_TS_PROVIDERS_NOT_REGISTERED()
  {
    return localizer.localize(localizableSSL_TS_PROVIDERS_NOT_REGISTERED());
  }
  
  public static Localizable localizableINJECTION_ERROR_NONSTATIC_MEMBER_CLASS_NOT_SUPPORTED(Object arg0)
  {
    return messageFactory.getMessage("injection.error.nonstatic.member.class.not.supported", new Object[] { arg0 });
  }
  
  public static String INJECTION_ERROR_NONSTATIC_MEMBER_CLASS_NOT_SUPPORTED(Object arg0)
  {
    return localizer.localize(localizableINJECTION_ERROR_NONSTATIC_MEMBER_CLASS_NOT_SUPPORTED(arg0));
  }
  
  public static Localizable localizableURI_BUILDER_SCHEME_PART_NULL()
  {
    return messageFactory.getMessage("uri.builder.scheme.part.null", new Object[0]);
  }
  
  public static String URI_BUILDER_SCHEME_PART_NULL()
  {
    return localizer.localize(localizableURI_BUILDER_SCHEME_PART_NULL());
  }
  
  public static Localizable localizableMATRIX_PARAM_NULL()
  {
    return messageFactory.getMessage("matrix.param.null", new Object[0]);
  }
  
  public static String MATRIX_PARAM_NULL()
  {
    return localizer.localize(localizableMATRIX_PARAM_NULL());
  }
  
  public static Localizable localizableSAX_CANNOT_ENABLE_SECURE_PROCESSING_FEATURE()
  {
    return messageFactory.getMessage("sax.cannot.enable.secure.processing.feature", new Object[0]);
  }
  
  public static String SAX_CANNOT_ENABLE_SECURE_PROCESSING_FEATURE()
  {
    return localizer.localize(localizableSAX_CANNOT_ENABLE_SECURE_PROCESSING_FEATURE());
  }
  
  public static Localizable localizableWARNINGS_DETECTED(Object arg0)
  {
    return messageFactory.getMessage("warnings.detected", new Object[] { arg0 });
  }
  
  public static String WARNINGS_DETECTED(Object arg0)
  {
    return localizer.localize(localizableWARNINGS_DETECTED(arg0));
  }
  
  public static Localizable localizableHINT_MSG(Object arg0)
  {
    return messageFactory.getMessage("hint.msg", new Object[] { arg0 });
  }
  
  public static String HINT_MSG(Object arg0)
  {
    return localizer.localize(localizableHINT_MSG(arg0));
  }
  
  public static Localizable localizableSSL_TS_LOAD_ERROR(Object arg0)
  {
    return messageFactory.getMessage("ssl.ts.load.error", new Object[] { arg0 });
  }
  
  public static String SSL_TS_LOAD_ERROR(Object arg0)
  {
    return localizer.localize(localizableSSL_TS_LOAD_ERROR(arg0));
  }
  
  public static Localizable localizableERROR_PROVIDER_REGISTERED_WRONG_RUNTIME(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("error.provider.registered.wrong.runtime", new Object[] { arg0, arg1 });
  }
  
  public static String ERROR_PROVIDER_REGISTERED_WRONG_RUNTIME(Object arg0, Object arg1)
  {
    return localizer.localize(localizableERROR_PROVIDER_REGISTERED_WRONG_RUNTIME(arg0, arg1));
  }
  
  public static Localizable localizableSSL_KMF_NO_PASSWORD_FOR_PROVIDER_BASED_KS()
  {
    return messageFactory.getMessage("ssl.kmf.no.password.for.provider.based.ks", new Object[0]);
  }
  
  public static String SSL_KMF_NO_PASSWORD_FOR_PROVIDER_BASED_KS()
  {
    return localizer.localize(localizableSSL_KMF_NO_PASSWORD_FOR_PROVIDER_BASED_KS());
  }
  
  public static Localizable localizableURI_PARSER_SCHEME_EXPECTED(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.parser.scheme.expected", new Object[] { arg0, arg1 });
  }
  
  public static String URI_PARSER_SCHEME_EXPECTED(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_PARSER_SCHEME_EXPECTED(arg0, arg1));
  }
  
  public static Localizable localizableSECURITY_CONTEXT_WAS_ALREADY_SET()
  {
    return messageFactory.getMessage("security.context.was.already.set", new Object[0]);
  }
  
  public static String SECURITY_CONTEXT_WAS_ALREADY_SET()
  {
    return localizer.localize(localizableSECURITY_CONTEXT_WAS_ALREADY_SET());
  }
  
  public static Localizable localizableINVOCATION_FAILED(Object arg0)
  {
    return messageFactory.getMessage("invocation.failed", new Object[] { arg0 });
  }
  
  public static String INVOCATION_FAILED(Object arg0)
  {
    return localizer.localize(localizableINVOCATION_FAILED(arg0));
  }
  
  public static Localizable localizableMBW_TRYING_TO_CLOSE_STREAM(Object arg0)
  {
    return messageFactory.getMessage("mbw.trying.to.close.stream", new Object[] { arg0 });
  }
  
  public static String MBW_TRYING_TO_CLOSE_STREAM(Object arg0)
  {
    return localizer.localize(localizableMBW_TRYING_TO_CLOSE_STREAM(arg0));
  }
  
  public static Localizable localizableTOO_MANY_HEADER_VALUES(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("too.many.header.values", new Object[] { arg0, arg1 });
  }
  
  public static String TOO_MANY_HEADER_VALUES(Object arg0, Object arg1)
  {
    return localizer.localize(localizableTOO_MANY_HEADER_VALUES(arg0, arg1));
  }
  
  public static Localizable localizableCOMPONENT_CONTRACTS_EMPTY_OR_NULL(Object arg0)
  {
    return messageFactory.getMessage("component.contracts.empty.or.null", new Object[] { arg0 });
  }
  
  public static String COMPONENT_CONTRACTS_EMPTY_OR_NULL(Object arg0)
  {
    return localizer.localize(localizableCOMPONENT_CONTRACTS_EMPTY_OR_NULL(arg0));
  }
  
  public static Localizable localizablePROVIDER_NOT_FOUND(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("provider.not.found", new Object[] { arg0, arg1 });
  }
  
  public static String PROVIDER_NOT_FOUND(Object arg0, Object arg1)
  {
    return localizer.localize(localizablePROVIDER_NOT_FOUND(arg0, arg1));
  }
  
  public static Localizable localizableCACHE_CONTROL_IS_NULL()
  {
    return messageFactory.getMessage("cache.control.is.null", new Object[0]);
  }
  
  public static String CACHE_CONTROL_IS_NULL()
  {
    return localizer.localize(localizableCACHE_CONTROL_IS_NULL());
  }
  
  public static Localizable localizableHTTP_HEADER_END_OF_HEADER()
  {
    return messageFactory.getMessage("http.header.end.of.header", new Object[0]);
  }
  
  public static String HTTP_HEADER_END_OF_HEADER()
  {
    return localizer.localize(localizableHTTP_HEADER_END_OF_HEADER());
  }
  
  public static Localizable localizableHTTP_HEADER_COMMENTS_NOT_ALLOWED()
  {
    return messageFactory.getMessage("http.header.comments.not.allowed", new Object[0]);
  }
  
  public static String HTTP_HEADER_COMMENTS_NOT_ALLOWED()
  {
    return localizer.localize(localizableHTTP_HEADER_COMMENTS_NOT_ALLOWED());
  }
  
  public static Localizable localizableCOMPONENT_CLASS_CANNOT_BE_NULL()
  {
    return messageFactory.getMessage("component.class.cannot.be.null", new Object[0]);
  }
  
  public static String COMPONENT_CLASS_CANNOT_BE_NULL()
  {
    return localizer.localize(localizableCOMPONENT_CLASS_CANNOT_BE_NULL());
  }
  
  public static Localizable localizableURI_BUILDER_SCHEMA_PART_OPAQUE()
  {
    return messageFactory.getMessage("uri.builder.schema.part.opaque", new Object[0]);
  }
  
  public static String URI_BUILDER_SCHEMA_PART_OPAQUE()
  {
    return localizer.localize(localizableURI_BUILDER_SCHEMA_PART_OPAQUE());
  }
  
  public static Localizable localizableREQUEST_CANCEL_FAILED(Object arg0)
  {
    return messageFactory.getMessage("request.cancel.failed", new Object[] { arg0 });
  }
  
  public static String REQUEST_CANCEL_FAILED(Object arg0)
  {
    return localizer.localize(localizableREQUEST_CANCEL_FAILED(arg0));
  }
  
  public static Localizable localizableNO_ERROR_PROCESSING_IN_SCOPE()
  {
    return messageFactory.getMessage("no.error.processing.in.scope", new Object[0]);
  }
  
  public static String NO_ERROR_PROCESSING_IN_SCOPE()
  {
    return localizer.localize(localizableNO_ERROR_PROCESSING_IN_SCOPE());
  }
  
  public static Localizable localizableCONTRACT_NOT_SUPPORTED(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("contract.not.supported", new Object[] { arg0, arg1 });
  }
  
  public static String CONTRACT_NOT_SUPPORTED(Object arg0, Object arg1)
  {
    return localizer.localize(localizableCONTRACT_NOT_SUPPORTED(arg0, arg1));
  }
  
  public static Localizable localizableINVALID_SPI_CLASSES(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("invalid.spi.classes", new Object[] { arg0, arg1 });
  }
  
  public static String INVALID_SPI_CLASSES(Object arg0, Object arg1)
  {
    return localizer.localize(localizableINVALID_SPI_CLASSES(arg0, arg1));
  }
  
  public static Localizable localizablePROVIDER_COULD_NOT_BE_CREATED(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("provider.could.not.be.created", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String PROVIDER_COULD_NOT_BE_CREATED(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizablePROVIDER_COULD_NOT_BE_CREATED(arg0, arg1, arg2));
  }
  
  public static Localizable localizableERROR_NOTFOUND_MESSAGEBODYREADER(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.notfound.messagebodyreader", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_NOTFOUND_MESSAGEBODYREADER(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_NOTFOUND_MESSAGEBODYREADER(arg0, arg1, arg2));
  }
  
  public static Localizable localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_READER_INTERCEPTOR_CONTEXT(Object arg0)
  {
    return messageFactory.getMessage("error.service.locator.provider.instance.feature.reader.interceptor.context", new Object[] { arg0 });
  }
  
  public static String ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_READER_INTERCEPTOR_CONTEXT(Object arg0)
  {
    return localizer.localize(localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_READER_INTERCEPTOR_CONTEXT(arg0));
  }
  
  public static Localizable localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_WRITER_INTERCEPTOR_CONTEXT(Object arg0)
  {
    return messageFactory.getMessage("error.service.locator.provider.instance.feature.writer.interceptor.context", new Object[] { arg0 });
  }
  
  public static String ERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_WRITER_INTERCEPTOR_CONTEXT(Object arg0)
  {
    return localizer.localize(localizableERROR_SERVICE_LOCATOR_PROVIDER_INSTANCE_FEATURE_WRITER_INTERCEPTOR_CONTEXT(arg0));
  }
  
  public static Localizable localizableDEPENDENT_CLASS_OF_PROVIDER_NOT_FOUND(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("dependent.class.of.provider.not.found", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String DEPENDENT_CLASS_OF_PROVIDER_NOT_FOUND(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableDEPENDENT_CLASS_OF_PROVIDER_NOT_FOUND(arg0, arg1, arg2));
  }
  
  public static Localizable localizableHTTP_HEADER_NO_END_SEPARATOR(Object arg0)
  {
    return messageFactory.getMessage("http.header.no.end.separator", new Object[] { arg0 });
  }
  
  public static String HTTP_HEADER_NO_END_SEPARATOR(Object arg0)
  {
    return localizer.localize(localizableHTTP_HEADER_NO_END_SEPARATOR(arg0));
  }
  
  public static Localizable localizableUSING_DEFAULT_REQUEST_EXECUTOR_PROVIDER(Object arg0)
  {
    return messageFactory.getMessage("using.default.request.executor.provider", new Object[] { arg0 });
  }
  
  public static String USING_DEFAULT_REQUEST_EXECUTOR_PROVIDER(Object arg0)
  {
    return localizer.localize(localizableUSING_DEFAULT_REQUEST_EXECUTOR_PROVIDER(arg0));
  }
  
  public static Localizable localizableSSL_KS_IMPL_NOT_FOUND()
  {
    return messageFactory.getMessage("ssl.ks.impl.not.found", new Object[0]);
  }
  
  public static String SSL_KS_IMPL_NOT_FOUND()
  {
    return localizer.localize(localizableSSL_KS_IMPL_NOT_FOUND());
  }
  
  public static Localizable localizableERROR_PROCESSING_MESSAGEBODY()
  {
    return messageFactory.getMessage("error.processing.messagebody", new Object[0]);
  }
  
  public static String ERROR_PROCESSING_MESSAGEBODY()
  {
    return localizer.localize(localizableERROR_PROCESSING_MESSAGEBODY());
  }
  
  public static Localizable localizableERROR_PROVIDER_AND_RESOURCE_CONSTRAINED_TO_IGNORED(Object arg0)
  {
    return messageFactory.getMessage("error.provider.and.resource.constrainedTo.ignored", new Object[] { arg0 });
  }
  
  public static String ERROR_PROVIDER_AND_RESOURCE_CONSTRAINED_TO_IGNORED(Object arg0)
  {
    return localizer.localize(localizableERROR_PROVIDER_AND_RESOURCE_CONSTRAINED_TO_IGNORED(arg0));
  }
  
  public static Localizable localizableINVALID_PORT()
  {
    return messageFactory.getMessage("invalid.port", new Object[0]);
  }
  
  public static String INVALID_PORT()
  {
    return localizer.localize(localizableINVALID_PORT());
  }
  
  public static Localizable localizableERROR_INTERCEPTOR_WRITER_PROCEED()
  {
    return messageFactory.getMessage("error.interceptor.writer.proceed", new Object[0]);
  }
  
  public static String ERROR_INTERCEPTOR_WRITER_PROCEED()
  {
    return localizer.localize(localizableERROR_INTERCEPTOR_WRITER_PROCEED());
  }
  
  public static Localizable localizableHTTP_HEADER_NO_CHARS_BETWEEN_SEPARATORS(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("http.header.no.chars.between.separators", new Object[] { arg0, arg1 });
  }
  
  public static String HTTP_HEADER_NO_CHARS_BETWEEN_SEPARATORS(Object arg0, Object arg1)
  {
    return localizer.localize(localizableHTTP_HEADER_NO_CHARS_BETWEEN_SEPARATORS(arg0, arg1));
  }
  
  public static Localizable localizableILLEGAL_LOAD_FACTOR(Object arg0)
  {
    return messageFactory.getMessage("illegal.load.factor", new Object[] { arg0 });
  }
  
  public static String ILLEGAL_LOAD_FACTOR(Object arg0)
  {
    return localizer.localize(localizableILLEGAL_LOAD_FACTOR(arg0));
  }
  
  public static Localizable localizableSOME_HEADERS_NOT_SENT(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("some.headers.not.sent", new Object[] { arg0, arg1 });
  }
  
  public static String SOME_HEADERS_NOT_SENT(Object arg0, Object arg1)
  {
    return localizer.localize(localizableSOME_HEADERS_NOT_SENT(arg0, arg1));
  }
  
  public static Localizable localizableQUERY_PARAM_NULL()
  {
    return messageFactory.getMessage("query.param.null", new Object[0]);
  }
  
  public static String QUERY_PARAM_NULL()
  {
    return localizer.localize(localizableQUERY_PARAM_NULL());
  }
  
  public static Localizable localizableILLEGAL_PROVIDER_CLASS_NAME(Object arg0)
  {
    return messageFactory.getMessage("illegal.provider.class.name", new Object[] { arg0 });
  }
  
  public static String ILLEGAL_PROVIDER_CLASS_NAME(Object arg0)
  {
    return localizer.localize(localizableILLEGAL_PROVIDER_CLASS_NAME(arg0));
  }
  
  public static Localizable localizableSTREAM_PROVIDER_NULL()
  {
    return messageFactory.getMessage("stream.provider.null", new Object[0]);
  }
  
  public static String STREAM_PROVIDER_NULL()
  {
    return localizer.localize(localizableSTREAM_PROVIDER_NULL());
  }
  
  public static Localizable localizableSSL_TMF_PROVIDER_NOT_REGISTERED()
  {
    return messageFactory.getMessage("ssl.tmf.provider.not.registered", new Object[0]);
  }
  
  public static String SSL_TMF_PROVIDER_NOT_REGISTERED()
  {
    return localizer.localize(localizableSSL_TMF_PROVIDER_NOT_REGISTERED());
  }
  
  public static Localizable localizableNO_CONTAINER_AVAILABLE()
  {
    return messageFactory.getMessage("no.container.available", new Object[0]);
  }
  
  public static String NO_CONTAINER_AVAILABLE()
  {
    return localizer.localize(localizableNO_CONTAINER_AVAILABLE());
  }
  
  public static Localizable localizableHK_2_FAILURE_OUTSIDE_ERROR_SCOPE()
  {
    return messageFactory.getMessage("hk2.failure.outside.error.scope", new Object[0]);
  }
  
  public static String HK_2_FAILURE_OUTSIDE_ERROR_SCOPE()
  {
    return localizer.localize(localizableHK_2_FAILURE_OUTSIDE_ERROR_SCOPE());
  }
  
  public static Localizable localizableERROR_ENTITY_PROVIDER_BASICTYPES_CONSTRUCTOR(Object arg0)
  {
    return messageFactory.getMessage("error.entity.provider.basictypes.constructor", new Object[] { arg0 });
  }
  
  public static String ERROR_ENTITY_PROVIDER_BASICTYPES_CONSTRUCTOR(Object arg0)
  {
    return localizer.localize(localizableERROR_ENTITY_PROVIDER_BASICTYPES_CONSTRUCTOR(arg0));
  }
  
  public static Localizable localizableERROR_NOTFOUND_MESSAGEBODYWRITER(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.notfound.messagebodywriter", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_NOTFOUND_MESSAGEBODYWRITER(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_NOTFOUND_MESSAGEBODYWRITER(arg0, arg1, arg2));
  }
  
  public static Localizable localizableCONTRACT_NOT_ASSIGNABLE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("contract.not.assignable", new Object[] { arg0, arg1 });
  }
  
  public static String CONTRACT_NOT_ASSIGNABLE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableCONTRACT_NOT_ASSIGNABLE(arg0, arg1));
  }
  
  public static Localizable localizableSSL_TMF_ALGORITHM_NOT_SUPPORTED()
  {
    return messageFactory.getMessage("ssl.tmf.algorithm.not.supported", new Object[0]);
  }
  
  public static String SSL_TMF_ALGORITHM_NOT_SUPPORTED()
  {
    return localizer.localize(localizableSSL_TMF_ALGORITHM_NOT_SUPPORTED());
  }
  
  public static Localizable localizableOSGI_REGISTRY_ERROR_OPENING_RESOURCE_STREAM(Object arg0)
  {
    return messageFactory.getMessage("osgi.registry.error.opening.resource.stream", new Object[] { arg0 });
  }
  
  public static String OSGI_REGISTRY_ERROR_OPENING_RESOURCE_STREAM(Object arg0)
  {
    return localizer.localize(localizableOSGI_REGISTRY_ERROR_OPENING_RESOURCE_STREAM(arg0));
  }
  
  public static Localizable localizableMBR_TRYING_TO_CLOSE_STREAM(Object arg0)
  {
    return messageFactory.getMessage("mbr.trying.to.close.stream", new Object[] { arg0 });
  }
  
  public static String MBR_TRYING_TO_CLOSE_STREAM(Object arg0)
  {
    return localizer.localize(localizableMBR_TRYING_TO_CLOSE_STREAM(arg0));
  }
  
  public static Localizable localizableURI_PARSER_NOT_EXECUTED()
  {
    return messageFactory.getMessage("uri.parser.not.executed", new Object[0]);
  }
  
  public static String URI_PARSER_NOT_EXECUTED()
  {
    return localizer.localize(localizableURI_PARSER_NOT_EXECUTED());
  }
  
  public static Localizable localizableMESSAGE_CONTENT_BUFFERING_FAILED()
  {
    return messageFactory.getMessage("message.content.buffering.failed", new Object[0]);
  }
  
  public static String MESSAGE_CONTENT_BUFFERING_FAILED()
  {
    return localizer.localize(localizableMESSAGE_CONTENT_BUFFERING_FAILED());
  }
  
  public static Localizable localizableRESPONSE_CLOSED()
  {
    return messageFactory.getMessage("response.closed", new Object[0]);
  }
  
  public static String RESPONSE_CLOSED()
  {
    return localizer.localize(localizableRESPONSE_CLOSED());
  }
  
  public static Localizable localizableSSL_KS_LOAD_ERROR(Object arg0)
  {
    return messageFactory.getMessage("ssl.ks.load.error", new Object[] { arg0 });
  }
  
  public static String SSL_KS_LOAD_ERROR(Object arg0)
  {
    return localizer.localize(localizableSSL_KS_LOAD_ERROR(arg0));
  }
  
  public static Localizable localizableHTTP_HEADERS_WAS_ALREADY_SET()
  {
    return messageFactory.getMessage("http.headers.was.already.set", new Object[0]);
  }
  
  public static String HTTP_HEADERS_WAS_ALREADY_SET()
  {
    return localizer.localize(localizableHTTP_HEADERS_WAS_ALREADY_SET());
  }
  
  public static Localizable localizableCOMMITTING_STREAM_ALREADY_INITIALIZED()
  {
    return messageFactory.getMessage("committing.stream.already.initialized", new Object[0]);
  }
  
  public static String COMMITTING_STREAM_ALREADY_INITIALIZED()
  {
    return localizer.localize(localizableCOMMITTING_STREAM_ALREADY_INITIALIZED());
  }
  
  public static Localizable localizableERROR_ENTITY_PROVIDER_BASICTYPES_CHARACTER_MORECHARS()
  {
    return messageFactory.getMessage("error.entity.provider.basictypes.character.morechars", new Object[0]);
  }
  
  public static String ERROR_ENTITY_PROVIDER_BASICTYPES_CHARACTER_MORECHARS()
  {
    return localizer.localize(localizableERROR_ENTITY_PROVIDER_BASICTYPES_CHARACTER_MORECHARS());
  }
  
  public static Localizable localizableERROR_ENTITY_STREAM_CLOSED()
  {
    return messageFactory.getMessage("error.entity.stream.closed", new Object[0]);
  }
  
  public static String ERROR_ENTITY_STREAM_CLOSED()
  {
    return localizer.localize(localizableERROR_ENTITY_STREAM_CLOSED());
  }
  
  public static Localizable localizableSAX_XDK_NO_SECURITY_FEATURES()
  {
    return messageFactory.getMessage("sax.xdk.no.security.features", new Object[0]);
  }
  
  public static String SAX_XDK_NO_SECURITY_FEATURES()
  {
    return localizer.localize(localizableSAX_XDK_NO_SECURITY_FEATURES());
  }
  
  public static Localizable localizableMESSAGE_CONTENT_INPUT_STREAM_CLOSE_FAILED()
  {
    return messageFactory.getMessage("message.content.input.stream.close.failed", new Object[0]);
  }
  
  public static String MESSAGE_CONTENT_INPUT_STREAM_CLOSE_FAILED()
  {
    return localizer.localize(localizableMESSAGE_CONTENT_INPUT_STREAM_CLOSE_FAILED());
  }
  
  public static Localizable localizableERROR_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("error.provider.constrainedTo.wrong.package", new Object[] { arg0, arg1 });
  }
  
  public static String ERROR_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableERROR_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(arg0, arg1));
  }
  
  public static Localizable localizableREQUEST_WAS_NOT_SET()
  {
    return messageFactory.getMessage("request.was.not.set", new Object[0]);
  }
  
  public static String REQUEST_WAS_NOT_SET()
  {
    return localizer.localize(localizableREQUEST_WAS_NOT_SET());
  }
  
  public static Localizable localizableILLEGAL_INVOCATION_CONTEXT_STATE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("illegal.invocation.context.state", new Object[] { arg0, arg1 });
  }
  
  public static String ILLEGAL_INVOCATION_CONTEXT_STATE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableILLEGAL_INVOCATION_CONTEXT_STATE(arg0, arg1));
  }
  
  public static Localizable localizableREQUEST_EXECUTION_FAILED()
  {
    return messageFactory.getMessage("request.execution.failed", new Object[0]);
  }
  
  public static String REQUEST_EXECUTION_FAILED()
  {
    return localizer.localize(localizableREQUEST_EXECUTION_FAILED());
  }
  
  public static Localizable localizableSSL_KS_PROVIDERS_NOT_REGISTERED()
  {
    return messageFactory.getMessage("ssl.ks.providers.not.registered", new Object[0]);
  }
  
  public static String SSL_KS_PROVIDERS_NOT_REGISTERED()
  {
    return localizer.localize(localizableSSL_KS_PROVIDERS_NOT_REGISTERED());
  }
  
  public static Localizable localizablePROPERTIES_HELPER_GET_VALUE_NO_TRANSFORM(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("properties.helper.get.value.no.transform", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String PROPERTIES_HELPER_GET_VALUE_NO_TRANSFORM(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizablePROPERTIES_HELPER_GET_VALUE_NO_TRANSFORM(arg0, arg1, arg2));
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_INVALID_SYNTAX_TERMINATED(Object arg0)
  {
    return messageFactory.getMessage("error.template.parser.invalid.syntax.terminated", new Object[] { arg0 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_INVALID_SYNTAX_TERMINATED(Object arg0)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_INVALID_SYNTAX_TERMINATED(arg0));
  }
  
  public static Localizable localizableURI_BUILDER_URI_PART_FRAGMENT(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.builder.uri.part.fragment", new Object[] { arg0, arg1 });
  }
  
  public static String URI_BUILDER_URI_PART_FRAGMENT(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_BUILDER_URI_PART_FRAGMENT(arg0, arg1));
  }
  
  public static Localizable localizableERROR_MBW_ISWRITABLE(Object arg0)
  {
    return messageFactory.getMessage("error.mbw.iswritable", new Object[] { arg0 });
  }
  
  public static String ERROR_MBW_ISWRITABLE(Object arg0)
  {
    return localizer.localize(localizableERROR_MBW_ISWRITABLE(arg0));
  }
  
  public static Localizable localizableERROR_READING_ENTITY_MISSING()
  {
    return messageFactory.getMessage("error.reading.entity.missing", new Object[0]);
  }
  
  public static String ERROR_READING_ENTITY_MISSING()
  {
    return localizer.localize(localizableERROR_READING_ENTITY_MISSING());
  }
  
  public static Localizable localizableURI_INFO_WAS_NOT_SET()
  {
    return messageFactory.getMessage("uri.info.was.not.set", new Object[0]);
  }
  
  public static String URI_INFO_WAS_NOT_SET()
  {
    return localizer.localize(localizableURI_INFO_WAS_NOT_SET());
  }
  
  public static Localizable localizableINVALID_HOST()
  {
    return messageFactory.getMessage("invalid.host", new Object[0]);
  }
  
  public static String INVALID_HOST()
  {
    return localizer.localize(localizableINVALID_HOST());
  }
  
  public static Localizable localizableDEPENDENT_CLASS_OF_PROVIDER_FORMAT_ERROR(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("dependent.class.of.provider.format.error", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String DEPENDENT_CLASS_OF_PROVIDER_FORMAT_ERROR(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableDEPENDENT_CLASS_OF_PROVIDER_FORMAT_ERROR(arg0, arg1, arg2));
  }
  
  public static Localizable localizableEXCEPTION_MAPPER_SUPPORTED_TYPE_UNKNOWN(Object arg0)
  {
    return messageFactory.getMessage("exception.mapper.supported.type.unknown", new Object[] { arg0 });
  }
  
  public static String EXCEPTION_MAPPER_SUPPORTED_TYPE_UNKNOWN(Object arg0)
  {
    return localizer.localize(localizableEXCEPTION_MAPPER_SUPPORTED_TYPE_UNKNOWN(arg0));
  }
  
  public static Localizable localizableSAX_CANNOT_ENABLE_SECURITY_FEATURES()
  {
    return messageFactory.getMessage("sax.cannot.enable.security.features", new Object[0]);
  }
  
  public static String SAX_CANNOT_ENABLE_SECURITY_FEATURES()
  {
    return localizer.localize(localizableSAX_CANNOT_ENABLE_SECURITY_FEATURES());
  }
  
  public static Localizable localizableSSL_KMF_NO_PASSWORD_FOR_BYTE_BASED_KS()
  {
    return messageFactory.getMessage("ssl.kmf.no.password.for.byte.based.ks", new Object[0]);
  }
  
  public static String SSL_KMF_NO_PASSWORD_FOR_BYTE_BASED_KS()
  {
    return localizer.localize(localizableSSL_KMF_NO_PASSWORD_FOR_BYTE_BASED_KS());
  }
  
  public static Localizable localizableHTTP_HEADERS_WAS_NOT_SET()
  {
    return messageFactory.getMessage("http.headers.was.not.set", new Object[0]);
  }
  
  public static String HTTP_HEADERS_WAS_NOT_SET()
  {
    return localizer.localize(localizableHTTP_HEADERS_WAS_NOT_SET());
  }
  
  public static Localizable localizableTYPE_TO_CLASS_CONVERSION_NOT_SUPPORTED(Object arg0)
  {
    return messageFactory.getMessage("type.to.class.conversion.not.supported", new Object[] { arg0 });
  }
  
  public static String TYPE_TO_CLASS_CONVERSION_NOT_SUPPORTED(Object arg0)
  {
    return localizer.localize(localizableTYPE_TO_CLASS_CONVERSION_NOT_SUPPORTED(arg0));
  }
  
  public static Localizable localizableSECURITY_CONTEXT_WAS_NOT_SET()
  {
    return messageFactory.getMessage("security.context.was.not.set", new Object[0]);
  }
  
  public static String SECURITY_CONTEXT_WAS_NOT_SET()
  {
    return localizer.localize(localizableSECURITY_CONTEXT_WAS_NOT_SET());
  }
  
  public static Localizable localizableFEATURE_HAS_ALREADY_BEEN_PROCESSED(Object arg0)
  {
    return messageFactory.getMessage("feature.has.already.been.processed", new Object[] { arg0 });
  }
  
  public static String FEATURE_HAS_ALREADY_BEEN_PROCESSED(Object arg0)
  {
    return localizer.localize(localizableFEATURE_HAS_ALREADY_BEEN_PROCESSED(arg0));
  }
  
  public static Localizable localizableSSL_CTX_INIT_FAILED()
  {
    return messageFactory.getMessage("ssl.ctx.init.failed", new Object[0]);
  }
  
  public static String SSL_CTX_INIT_FAILED()
  {
    return localizer.localize(localizableSSL_CTX_INIT_FAILED());
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_INVALID_SYNTAX(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("error.template.parser.invalid.syntax", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_INVALID_SYNTAX(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_INVALID_SYNTAX(arg0, arg1, arg2));
  }
  
  public static Localizable localizableURI_BUILDER_SCHEME_PART_UNEXPECTED_COMPONENT(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.builder.scheme.part.unexpected.component", new Object[] { arg0, arg1 });
  }
  
  public static String URI_BUILDER_SCHEME_PART_UNEXPECTED_COMPONENT(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_BUILDER_SCHEME_PART_UNEXPECTED_COMPONENT(arg0, arg1));
  }
  
  public static Localizable localizableSSL_TS_IMPL_NOT_FOUND()
  {
    return messageFactory.getMessage("ssl.ts.impl.not.found", new Object[0]);
  }
  
  public static String SSL_TS_IMPL_NOT_FOUND()
  {
    return localizer.localize(localizableSSL_TS_IMPL_NOT_FOUND());
  }
  
  public static Localizable localizableWARNING_MSG(Object arg0)
  {
    return messageFactory.getMessage("warning.msg", new Object[] { arg0 });
  }
  
  public static String WARNING_MSG(Object arg0)
  {
    return localizer.localize(localizableWARNING_MSG(arg0));
  }
  
  public static Localizable localizableREQUEST_SUSPENDED_RESPONSE_IGNORED(Object arg0)
  {
    return messageFactory.getMessage("request.suspended.response.ignored", new Object[] { arg0 });
  }
  
  public static String REQUEST_SUSPENDED_RESPONSE_IGNORED(Object arg0)
  {
    return localizer.localize(localizableREQUEST_SUSPENDED_RESPONSE_IGNORED(arg0));
  }
  
  public static Localizable localizableWARNING_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return messageFactory.getMessage("warning.provider.constrainedTo.wrong.package", new Object[] { arg0, arg1, arg2, arg3 });
  }
  
  public static String WARNING_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return localizer.localize(localizableWARNING_PROVIDER_CONSTRAINED_TO_WRONG_PACKAGE(arg0, arg1, arg2, arg3));
  }
  
  public static Localizable localizableHINTS_DETECTED(Object arg0)
  {
    return messageFactory.getMessage("hints.detected", new Object[] { arg0 });
  }
  
  public static String HINTS_DETECTED(Object arg0)
  {
    return localizer.localize(localizableHINTS_DETECTED(arg0));
  }
  
  public static Localizable localizableHTTP_HEADER_UNBALANCED_COMMENTS()
  {
    return messageFactory.getMessage("http.header.unbalanced.comments", new Object[0]);
  }
  
  public static String HTTP_HEADER_UNBALANCED_COMMENTS()
  {
    return localizer.localize(localizableHTTP_HEADER_UNBALANCED_COMMENTS());
  }
  
  public static Localizable localizableURI_BUILDER_METHODNAME_NOT_SPECIFIED(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("uri.builder.methodname.not.specified", new Object[] { arg0, arg1 });
  }
  
  public static String URI_BUILDER_METHODNAME_NOT_SPECIFIED(Object arg0, Object arg1)
  {
    return localizer.localize(localizableURI_BUILDER_METHODNAME_NOT_SPECIFIED(arg0, arg1));
  }
  
  public static Localizable localizableSSL_KMF_UNRECOVERABLE_KEY()
  {
    return messageFactory.getMessage("ssl.kmf.unrecoverable.key", new Object[0]);
  }
  
  public static String SSL_KMF_UNRECOVERABLE_KEY()
  {
    return localizer.localize(localizableSSL_KMF_UNRECOVERABLE_KEY());
  }
  
  public static Localizable localizableINJECTION_ERROR_SUITABLE_CONSTRUCTOR_NOT_FOUND(Object arg0)
  {
    return messageFactory.getMessage("injection.error.suitable.constructor.not.found", new Object[] { arg0 });
  }
  
  public static String INJECTION_ERROR_SUITABLE_CONSTRUCTOR_NOT_FOUND(Object arg0)
  {
    return localizer.localize(localizableINJECTION_ERROR_SUITABLE_CONSTRUCTOR_NOT_FOUND(arg0));
  }
  
  public static Localizable localizableAUTODISCOVERABLE_CONFIGURATION_FAILED(Object arg0)
  {
    return messageFactory.getMessage("autodiscoverable.configuration.failed", new Object[] { arg0 });
  }
  
  public static String AUTODISCOVERABLE_CONFIGURATION_FAILED(Object arg0)
  {
    return localizer.localize(localizableAUTODISCOVERABLE_CONFIGURATION_FAILED(arg0));
  }
  
  public static Localizable localizableREQUEST_EXECUTOR_FACTORY_CLOSED(Object arg0)
  {
    return messageFactory.getMessage("request.executor.factory.closed", new Object[] { arg0 });
  }
  
  public static String REQUEST_EXECUTOR_FACTORY_CLOSED(Object arg0)
  {
    return localizer.localize(localizableREQUEST_EXECUTOR_FACTORY_CLOSED(arg0));
  }
  
  public static Localizable localizableURI_COMPONENT_INVALID_CHARACTER(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return messageFactory.getMessage("uri.component.invalid.character", new Object[] { arg0, arg1, arg2, arg3 });
  }
  
  public static String URI_COMPONENT_INVALID_CHARACTER(Object arg0, Object arg1, Object arg2, Object arg3)
  {
    return localizer.localize(localizableURI_COMPONENT_INVALID_CHARACTER(arg0, arg1, arg2, arg3));
  }
  
  public static Localizable localizableSSL_KS_FILE_NOT_FOUND(Object arg0)
  {
    return messageFactory.getMessage("ssl.ks.file.not.found", new Object[] { arg0 });
  }
  
  public static String SSL_KS_FILE_NOT_FOUND(Object arg0)
  {
    return localizer.localize(localizableSSL_KS_FILE_NOT_FOUND(arg0));
  }
  
  public static Localizable localizableEXCEPTION_CAUGHT_WHILE_LOADING_SPI_PROVIDERS()
  {
    return messageFactory.getMessage("exception.caught.while.loading.spi.providers", new Object[0]);
  }
  
  public static String EXCEPTION_CAUGHT_WHILE_LOADING_SPI_PROVIDERS()
  {
    return localizer.localize(localizableEXCEPTION_CAUGHT_WHILE_LOADING_SPI_PROVIDERS());
  }
  
  public static Localizable localizableREQUEST_WAS_ALREADY_SET()
  {
    return messageFactory.getMessage("request.was.already.set", new Object[0]);
  }
  
  public static String REQUEST_WAS_ALREADY_SET()
  {
    return localizer.localize(localizableREQUEST_WAS_ALREADY_SET());
  }
  
  public static Localizable localizableERROR_MSG(Object arg0)
  {
    return messageFactory.getMessage("error.msg", new Object[] { arg0 });
  }
  
  public static String ERROR_MSG(Object arg0)
  {
    return localizer.localize(localizableERROR_MSG(arg0));
  }
  
  public static Localizable localizableURI_IS_NULL()
  {
    return messageFactory.getMessage("uri.is.null", new Object[0]);
  }
  
  public static String URI_IS_NULL()
  {
    return localizer.localize(localizableURI_IS_NULL());
  }
  
  public static Localizable localizableOSGI_REGISTRY_ERROR_PROCESSING_RESOURCE_STREAM(Object arg0)
  {
    return messageFactory.getMessage("osgi.registry.error.processing.resource.stream", new Object[] { arg0 });
  }
  
  public static String OSGI_REGISTRY_ERROR_PROCESSING_RESOURCE_STREAM(Object arg0)
  {
    return localizer.localize(localizableOSGI_REGISTRY_ERROR_PROCESSING_RESOURCE_STREAM(arg0));
  }
  
  public static Localizable localizablePROVIDER_CLASS_COULD_NOT_BE_LOADED(Object arg0, Object arg1, Object arg2)
  {
    return messageFactory.getMessage("provider.class.could.not.be.loaded", new Object[] { arg0, arg1, arg2 });
  }
  
  public static String PROVIDER_CLASS_COULD_NOT_BE_LOADED(Object arg0, Object arg1, Object arg2)
  {
    return localizer.localize(localizablePROVIDER_CLASS_COULD_NOT_BE_LOADED(arg0, arg1, arg2));
  }
  
  public static Localizable localizableCALLBACK_METHOD_INVOCATION_FAILED(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("callback.method.invocation.failed", new Object[] { arg0, arg1 });
  }
  
  public static String CALLBACK_METHOD_INVOCATION_FAILED(Object arg0, Object arg1)
  {
    return localizer.localize(localizableCALLBACK_METHOD_INVOCATION_FAILED(arg0, arg1));
  }
  
  public static Localizable localizableCOMPONENT_TYPE_ALREADY_REGISTERED(Object arg0)
  {
    return messageFactory.getMessage("component.type.already.registered", new Object[] { arg0 });
  }
  
  public static String COMPONENT_TYPE_ALREADY_REGISTERED(Object arg0)
  {
    return localizer.localize(localizableCOMPONENT_TYPE_ALREADY_REGISTERED(arg0));
  }
  
  public static Localizable localizableSTRING_IS_NULL()
  {
    return messageFactory.getMessage("string.is.null", new Object[0]);
  }
  
  public static String STRING_IS_NULL()
  {
    return localizer.localize(localizableSTRING_IS_NULL());
  }
  
  public static Localizable localizableERROR_ENTITY_PROVIDER_BASICTYPES_UNKWNOWN(Object arg0)
  {
    return messageFactory.getMessage("error.entity.provider.basictypes.unkwnown", new Object[] { arg0 });
  }
  
  public static String ERROR_ENTITY_PROVIDER_BASICTYPES_UNKWNOWN(Object arg0)
  {
    return localizer.localize(localizableERROR_ENTITY_PROVIDER_BASICTYPES_UNKWNOWN(arg0));
  }
  
  public static Localizable localizableDATE_IS_NULL()
  {
    return messageFactory.getMessage("date.is.null", new Object[0]);
  }
  
  public static String DATE_IS_NULL()
  {
    return localizer.localize(localizableDATE_IS_NULL());
  }
  
  public static Localizable localizableERROR_RESOLVING_GENERIC_TYPE_VALUE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("error.resolving.generic.type.value", new Object[] { arg0, arg1 });
  }
  
  public static String ERROR_RESOLVING_GENERIC_TYPE_VALUE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableERROR_RESOLVING_GENERIC_TYPE_VALUE(arg0, arg1));
  }
  
  public static Localizable localizableERROR_TEMPLATE_PARSER_NAME_MORE_THAN_ONCE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("error.template.parser.name.more.than.once", new Object[] { arg0, arg1 });
  }
  
  public static String ERROR_TEMPLATE_PARSER_NAME_MORE_THAN_ONCE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableERROR_TEMPLATE_PARSER_NAME_MORE_THAN_ONCE(arg0, arg1));
  }
  
  public static Localizable localizableSSL_TS_INTEGRITY_ALGORITHM_NOT_FOUND()
  {
    return messageFactory.getMessage("ssl.ts.integrity.algorithm.not.found", new Object[0]);
  }
  
  public static String SSL_TS_INTEGRITY_ALGORITHM_NOT_FOUND()
  {
    return localizer.localize(localizableSSL_TS_INTEGRITY_ALGORITHM_NOT_FOUND());
  }
}
