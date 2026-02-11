package net.engineeringdigest.journalApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "config_journalapp")
@Data
@NoArgsConstructor
public class ConfigJournalappEntity {
  private String key;
  private String value;

}
