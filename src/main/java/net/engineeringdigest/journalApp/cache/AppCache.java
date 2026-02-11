package net.engineeringdigest.journalApp.cache;

import lombok.Data;
import lombok.Getter;
import net.engineeringdigest.journalApp.entity.ConfigJournalappEntity;
import net.engineeringdigest.journalApp.repository.ConfigJournalappRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {
   public enum keys{
       weatherApi;
   }
@Autowired
    private ConfigJournalappRepository configJournalappRepository;
public Map<String,String > appCache;
@PostConstruct
    public void init(){
    appCache =new HashMap<>();
    List<ConfigJournalappEntity> all=configJournalappRepository.findAll();
    for(ConfigJournalappEntity configJournalappEntity :all){
        appCache.put(configJournalappEntity.getKey(),configJournalappEntity.getValue());

    }
}
}
