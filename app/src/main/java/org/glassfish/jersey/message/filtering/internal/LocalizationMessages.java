package org.glassfish.jersey.message.filtering.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.message.filtering.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableMERGING_FILTERING_SCOPES()
  {
    return messageFactory.getMessage("merging.filtering.scopes", new Object[0]);
  }
  
  public static String MERGING_FILTERING_SCOPES()
  {
    return localizer.localize(localizableMERGING_FILTERING_SCOPES());
  }
  
  public static Localizable localizableENTITY_FILTERING_SCOPE_NOT_ANNOTATIONS(Object arg0)
  {
    return messageFactory.getMessage("entity.filtering.scope.not.annotations", new Object[] { arg0 });
  }
  
  public static String ENTITY_FILTERING_SCOPE_NOT_ANNOTATIONS(Object arg0)
  {
    return localizer.localize(localizableENTITY_FILTERING_SCOPE_NOT_ANNOTATIONS(arg0));
  }
}
