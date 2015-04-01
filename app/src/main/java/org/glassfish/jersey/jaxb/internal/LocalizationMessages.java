package org.glassfish.jersey.jaxb.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.jaxb.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableERROR_UNMARSHALLING_JAXB(Object arg0)
  {
    return messageFactory.getMessage("error.unmarshalling.jaxb", new Object[] { arg0 });
  }
  
  public static String ERROR_UNMARSHALLING_JAXB(Object arg0)
  {
    return localizer.localize(localizableERROR_UNMARSHALLING_JAXB(arg0));
  }
  
  public static Localizable localizableERROR_READING_ENTITY_MISSING()
  {
    return messageFactory.getMessage("error.reading.entity.missing", new Object[0]);
  }
  
  public static String ERROR_READING_ENTITY_MISSING()
  {
    return localizer.localize(localizableERROR_READING_ENTITY_MISSING());
  }
}
