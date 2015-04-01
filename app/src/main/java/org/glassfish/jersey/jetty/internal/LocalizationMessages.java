package org.glassfish.jersey.jetty.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.jetty.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableWRONG_SCHEME_WHEN_USING_HTTP()
  {
    return messageFactory.getMessage("wrong.scheme.when.using.http", new Object[0]);
  }
  
  public static String WRONG_SCHEME_WHEN_USING_HTTP()
  {
    return localizer.localize(localizableWRONG_SCHEME_WHEN_USING_HTTP());
  }
  
  public static Localizable localizableERROR_WHEN_CREATING_SERVER()
  {
    return messageFactory.getMessage("error.when.creating.server", new Object[0]);
  }
  
  public static String ERROR_WHEN_CREATING_SERVER()
  {
    return localizer.localize(localizableERROR_WHEN_CREATING_SERVER());
  }
  
  public static Localizable localizableWRONG_SCHEME_WHEN_USING_HTTPS()
  {
    return messageFactory.getMessage("wrong.scheme.when.using.https", new Object[0]);
  }
  
  public static String WRONG_SCHEME_WHEN_USING_HTTPS()
  {
    return localizer.localize(localizableWRONG_SCHEME_WHEN_USING_HTTPS());
  }
  
  public static Localizable localizableUNABLE_TO_CLOSE_RESPONSE()
  {
    return messageFactory.getMessage("unable.to.close.response", new Object[0]);
  }
  
  public static String UNABLE_TO_CLOSE_RESPONSE()
  {
    return localizer.localize(localizableUNABLE_TO_CLOSE_RESPONSE());
  }
  
  public static Localizable localizableEXCEPTION_SENDING_ERROR_RESPONSE(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("exception.sending.error.response", new Object[] { arg0, arg1 });
  }
  
  public static String EXCEPTION_SENDING_ERROR_RESPONSE(Object arg0, Object arg1)
  {
    return localizer.localize(localizableEXCEPTION_SENDING_ERROR_RESPONSE(arg0, arg1));
  }
  
  public static Localizable localizableURI_CANNOT_BE_NULL()
  {
    return messageFactory.getMessage("uri.cannot.be.null", new Object[0]);
  }
  
  public static String URI_CANNOT_BE_NULL()
  {
    return localizer.localize(localizableURI_CANNOT_BE_NULL());
  }
}
