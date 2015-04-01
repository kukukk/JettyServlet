package org.glassfish.jersey.jettison.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.jettison.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableERROR_WRITING_JSON_ARRAY()
  {
    return messageFactory.getMessage("error.writing.json.array", new Object[0]);
  }
  
  public static String ERROR_WRITING_JSON_ARRAY()
  {
    return localizer.localize(localizableERROR_WRITING_JSON_ARRAY());
  }
  
  public static Localizable localizableERROR_WRITING_JSON_OBJECT()
  {
    return messageFactory.getMessage("error.writing.json.object", new Object[0]);
  }
  
  public static String ERROR_WRITING_JSON_OBJECT()
  {
    return localizer.localize(localizableERROR_WRITING_JSON_OBJECT());
  }
  
  public static Localizable localizableERROR_PARSING_JSON_ARRAY()
  {
    return messageFactory.getMessage("error.parsing.json.array", new Object[0]);
  }
  
  public static String ERROR_PARSING_JSON_ARRAY()
  {
    return localizer.localize(localizableERROR_PARSING_JSON_ARRAY());
  }
  
  public static Localizable localizableERROR_PARSING_JSON_OBJECT()
  {
    return messageFactory.getMessage("error.parsing.json.object", new Object[0]);
  }
  
  public static String ERROR_PARSING_JSON_OBJECT()
  {
    return localizer.localize(localizableERROR_PARSING_JSON_OBJECT());
  }
}
