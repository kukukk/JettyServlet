package org.glassfish.jersey.servlet.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.servlet.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableFORM_PARAM_CONSUMED(Object arg0)
  {
    return messageFactory.getMessage("form.param.consumed", new Object[] { arg0 });
  }
  
  public static String FORM_PARAM_CONSUMED(Object arg0)
  {
    return localizer.localize(localizableFORM_PARAM_CONSUMED(arg0));
  }
  
  public static Localizable localizableSERVLET_PATH_MISMATCH(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("servlet.path.mismatch", new Object[] { arg0, arg1 });
  }
  
  public static String SERVLET_PATH_MISMATCH(Object arg0, Object arg1)
  {
    return localizer.localize(localizableSERVLET_PATH_MISMATCH(arg0, arg1));
  }
  
  public static Localizable localizableASYNC_PROCESSING_NOT_SUPPORTED()
  {
    return messageFactory.getMessage("async.processing.not.supported", new Object[0]);
  }
  
  public static String ASYNC_PROCESSING_NOT_SUPPORTED()
  {
    return localizer.localize(localizableASYNC_PROCESSING_NOT_SUPPORTED());
  }
  
  public static Localizable localizableSERVLET_REQUEST_SUSPEND_FAILED()
  {
    return messageFactory.getMessage("servlet.request.suspend.failed", new Object[0]);
  }
  
  public static String SERVLET_REQUEST_SUSPEND_FAILED()
  {
    return localizer.localize(localizableSERVLET_REQUEST_SUSPEND_FAILED());
  }
  
  public static Localizable localizableEXCEPTION_SENDING_ERROR_RESPONSE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("exception.sending.error.response", new Object[] { arg0, arg1 });
  }
  
  public static String EXCEPTION_SENDING_ERROR_RESPONSE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableEXCEPTION_SENDING_ERROR_RESPONSE(arg0, arg1));
  }
  
  public static Localizable localizableNO_THREAD_LOCAL_VALUE(Object arg0)
  {
    return messageFactory.getMessage("no.thread.local.value", new Object[] { arg0 });
  }
  
  public static String NO_THREAD_LOCAL_VALUE(Object arg0)
  {
    return localizer.localize(localizableNO_THREAD_LOCAL_VALUE(arg0));
  }
  
  public static Localizable localizableINIT_PARAM_REGEX_SYNTAX_INVALID(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("init.param.regex.syntax.invalid", new Object[] { arg0, arg1 });
  }
  
  public static String INIT_PARAM_REGEX_SYNTAX_INVALID(Object arg0, Object arg1)
  {
    return localizer.localize(localizableINIT_PARAM_REGEX_SYNTAX_INVALID(arg0, arg1));
  }
  
  public static Localizable localizableRESOURCE_CONFIG_UNABLE_TO_LOAD(Object arg0)
  {
    return messageFactory.getMessage("resource.config.unable.to.load", new Object[] { arg0 });
  }
  
  public static String RESOURCE_CONFIG_UNABLE_TO_LOAD(Object arg0)
  {
    return localizer.localize(localizableRESOURCE_CONFIG_UNABLE_TO_LOAD(arg0));
  }
  
  public static Localizable localizablePERSISTENCE_UNIT_NOT_CONFIGURED(Object arg0)
  {
    return messageFactory.getMessage("persistence.unit.not.configured", new Object[] { arg0 });
  }
  
  public static String PERSISTENCE_UNIT_NOT_CONFIGURED(Object arg0)
  {
    return localizer.localize(localizablePERSISTENCE_UNIT_NOT_CONFIGURED(arg0));
  }
  
  public static Localizable localizableRESOURCE_CONFIG_PARENT_CLASS_INVALID(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("resource.config.parent.class.invalid", new Object[] { arg0, arg1 });
  }
  
  public static String RESOURCE_CONFIG_PARENT_CLASS_INVALID(Object arg0, Object arg1)
  {
    return localizer.localize(localizableRESOURCE_CONFIG_PARENT_CLASS_INVALID(arg0, arg1));
  }
}
