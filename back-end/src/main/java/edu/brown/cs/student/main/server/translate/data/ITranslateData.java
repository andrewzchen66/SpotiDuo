package edu.brown.cs.student.main.server.translate.data;

import edu.brown.cs.student.main.server.translate.records.TranslateResult;

public interface ITranslateData {

  public TranslateResult getTranslation(String text, String fromLanguage, String toLanguage)
      throws Exception;
}
