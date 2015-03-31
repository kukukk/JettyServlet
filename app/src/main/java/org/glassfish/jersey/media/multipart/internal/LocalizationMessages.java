package org.glassfish.jersey.media.multipart.internal;

import org.glassfish.jersey.internal.l10n.Localizable;
import org.glassfish.jersey.internal.l10n.LocalizableMessageFactory;
import org.glassfish.jersey.internal.l10n.Localizer;

public final class LocalizationMessages
{
  private static final LocalizableMessageFactory messageFactory = new LocalizableMessageFactory("org.glassfish.jersey.media.multipart.internal.localization");
  private static final Localizer localizer = new Localizer();
  
  public static Localizable localizableENTITY_HAS_WRONG_TYPE()
  {
    return messageFactory.getMessage("entity.has.wrong.type", new Object[0]);
  }
  
  public static String ENTITY_HAS_WRONG_TYPE()
  {
    return localizer.localize(localizableENTITY_HAS_WRONG_TYPE());
  }
  
  public static Localizable localizableFORM_DATA_MULTIPART_CANNOT_CHANGE_MEDIATYPE()
  {
    return messageFactory.getMessage("form.data.multipart.cannot.change.mediatype", new Object[0]);
  }
  
  public static String FORM_DATA_MULTIPART_CANNOT_CHANGE_MEDIATYPE()
  {
    return localizer.localize(localizableFORM_DATA_MULTIPART_CANNOT_CHANGE_MEDIATYPE());
  }
  
  public static Localizable localizableTEMP_FILE_CANNOT_BE_CREATED(Object arg0)
  {
    return messageFactory.getMessage("temp.file.cannot.be.created", new Object[] { arg0 });
  }
  
  public static String TEMP_FILE_CANNOT_BE_CREATED(Object arg0)
  {
    return localizer.localize(localizableTEMP_FILE_CANNOT_BE_CREATED(arg0));
  }
  
  public static Localizable localizableNO_AVAILABLE_MBW(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("no.available.mbw", new Object[] { arg0, arg1 });
  }
  
  public static String NO_AVAILABLE_MBW(Object arg0, Object arg1)
  {
    return localizer.localize(localizableNO_AVAILABLE_MBW(arg0, arg1));
  }
  
  public static Localizable localizableERROR_PARSING_CONTENT_DISPOSITION(Object arg0)
  {
    return messageFactory.getMessage("error.parsing.content.disposition", new Object[] { arg0 });
  }
  
  public static String ERROR_PARSING_CONTENT_DISPOSITION(Object arg0)
  {
    return localizer.localize(localizableERROR_PARSING_CONTENT_DISPOSITION(arg0));
  }
  
  public static Localizable localizableCONTROL_NAME_CANNOT_BE_NULL()
  {
    return messageFactory.getMessage("control.name.cannot.be.null", new Object[0]);
  }
  
  public static String CONTROL_NAME_CANNOT_BE_NULL()
  {
    return localizer.localize(localizableCONTROL_NAME_CANNOT_BE_NULL());
  }
  
  public static Localizable localizableMISSING_ENTITY_OF_BODY_PART(Object arg0)
  {
    return messageFactory.getMessage("missing.entity.of.body.part", new Object[] { arg0 });
  }
  
  public static String MISSING_ENTITY_OF_BODY_PART(Object arg0)
  {
    return localizer.localize(localizableMISSING_ENTITY_OF_BODY_PART(arg0));
  }
  
  public static Localizable localizableCANNOT_INJECT_FILE()
  {
    return messageFactory.getMessage("cannot.inject.file", new Object[0]);
  }
  
  public static String CANNOT_INJECT_FILE()
  {
    return localizer.localize(localizableCANNOT_INJECT_FILE());
  }
  
  public static Localizable localizableNO_AVAILABLE_MBR(Object arg0, Object arg1)
  {
    return messageFactory.getMessage("no.available.mbr", new Object[] { arg0, arg1 });
  }
  
  public static String NO_AVAILABLE_MBR(Object arg0, Object arg1)
  {
    return localizer.localize(localizableNO_AVAILABLE_MBR(arg0, arg1));
  }
  
  public static Localizable localizableERROR_READING_ENTITY(Object arg0)
  {
    return messageFactory.getMessage("error.reading.entity", new Object[] { arg0 });
  }
  
  public static String ERROR_READING_ENTITY(Object arg0)
  {
    return localizer.localize(localizableERROR_READING_ENTITY(arg0));
  }
  
  public static Localizable localizableMUST_SPECIFY_BODY_PART()
  {
    return messageFactory.getMessage("must.specify.body.part", new Object[0]);
  }
  
  public static String MUST_SPECIFY_BODY_PART()
  {
    return localizer.localize(localizableMUST_SPECIFY_BODY_PART());
  }
  
  public static Localizable localizableMISSING_MEDIA_TYPE_OF_BODY_PART()
  {
    return messageFactory.getMessage("missing.media.type.of.body.part", new Object[0]);
  }
  
  public static String MISSING_MEDIA_TYPE_OF_BODY_PART()
  {
    return localizer.localize(localizableMISSING_MEDIA_TYPE_OF_BODY_PART());
  }
  
  public static Localizable localizableMEDIA_TYPE_NOT_TEXT_PLAIN()
  {
    return messageFactory.getMessage("media.type.not.text.plain", new Object[0]);
  }
  
  public static String MEDIA_TYPE_NOT_TEXT_PLAIN()
  {
    return localizer.localize(localizableMEDIA_TYPE_NOT_TEXT_PLAIN());
  }
}
