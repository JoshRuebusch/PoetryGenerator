//Joshua Ruebusch
/* This class makes an array of differnet parts of speech. It also randomly chooses words to be used by the robot classes. 
 * 2/26/10
 */ 

import java.util.Random;

public class Vocabulary
{
  
  private String nouns[];
  private String verbs[];
  private String adverbs[];
  private String adjectives[];
  private String prepositions[];
  private String articles[];
  private int index;
  
  //constructs object with 20 of each part of speech to chose from
  public Vocabulary()
  {
    nouns = new String[20];
    verbs = new String[20];
    adverbs = new String[20];
    adjectives = new String[20];
    prepositions = new String[20];
    articles = new String[1];
    
    nouns[0] = "actors";
    nouns[1] = "airplanes";
    nouns[2] = "aunts";
    nouns[3] = "baseballs";
    nouns[4] = "birds";
    nouns[5] = "classes";
    nouns[6] = "caves";
    nouns[7] = "chickens";
    nouns[8] = "cobwebs";
    nouns[9] = "cannons";
    nouns[10] = "cattle";
    nouns[11] = "coasts";
    nouns[12] = "cacti";
    nouns[13] = "daughters";
    nouns[14] = "earthquakes";
    nouns[15] = "feasts";
    nouns[16] = "ghosts";
    nouns[17] = "seashores";
    nouns[18] = "thrones";
    nouns[19] = "voyages";
    
    verbs[0] = "baking";
    verbs[1] = "calling";
    verbs[2] = "chasing";
    verbs[3] = "dropping";
    verbs[4] = "ending";
    verbs[5] = "escaping";
    verbs[6] = "gathering";
    verbs[7] = "grabbing";
    verbs[8] = "hanging";
    verbs[9] = "jumping";
    verbs[10] = "kicking";
    verbs[11] = "marching";
    verbs[12] = "noticing";
    verbs[13] = "passing";
    verbs[14] = "promising";
    verbs[15] = "questioning";
    verbs[16] = "talking";
    verbs[17] = "using";
    verbs[18] = "vanishing";
    verbs[19] = "yelling";
    
    adverbs[0] = "abnormally";
    adverbs[1] = "badly";
    adverbs[2] = "calmly";
    adverbs[3] = "easily";
    adverbs[4] = "freely";
    adverbs[5] = "gracefully";
    adverbs[6] = "happily";
    adverbs[7] = "intently";
    adverbs[8] = "knowingly";
    adverbs[9] = "longingly";
    adverbs[10] = "madly";
    adverbs[11] = "nervously";
    adverbs[12] = "powerfully";
    adverbs[13] = "rapidly";
    adverbs[14] = "solemnly";
    adverbs[15] = "terribly";
    adverbs[16] = "utterly";
    adverbs[17] = "violently";
    adverbs[18] = "warmly";
    adverbs[19] = "zestfully";
    
    adjectives[0] = "beautiful";
    adjectives[1] = "fancy";
    adjectives[2] = "red";
    adjectives[3] = "purple";
    adjectives[4] = "alive";
    adjectives[5] = "vast";
    adjectives[6] = "lazy";
    adjectives[7] = "scary";
    adjectives[8] = "calm";
    adjectives[9] = "eager";
    adjectives[10] = "broad";
    adjectives[11] = "chubby";
    adjectives[12] = "hollow";
    adjectives[13] = "round";
    adjectives[14] = "wide";
    adjectives[15] = "great";
    adjectives[16] = "immense";
    adjectives[17] = "short";
    adjectives[18] = "tall";
    adjectives[19] = "deafening";
    
    prepositions[0] = "aboard";
    prepositions[1] = "above";
    prepositions[2] = "across";
    prepositions[3] = "against";
    prepositions[4] = "along";
    prepositions[5] = "behind";
    prepositions[6] = "below";
    prepositions[7] = "beside";
    prepositions[8] = "between";
    prepositions[9] = "beyond";
    prepositions[10] = "inside";
    prepositions[11] = "on";
    prepositions[12] = "in";
    prepositions[13] = "around";
    prepositions[14] = "under";
    prepositions[15] = "near";
    prepositions[16] = "opposite";
    prepositions[17] = "via";
    prepositions[18] = "down";
    prepositions[19] = "up";
    
    articles[0] = "the";

    
  }
  
  Random random = new Random();
  
  //randomly choose different parts of speech
  public String selectNoun()
  {
    index = random.nextInt(nouns.length);
    return nouns[index];
  }
  
  public String selectVerb()
  {
    index = random.nextInt(verbs.length);
    return verbs[index];
  }
  
  public String selectAdverb()
  {
    index = random.nextInt(adverbs.length);
    return adverbs[index];
  }
  
  public String selectAdjective()
  {
    index = random.nextInt(adjectives.length);
    return adjectives[index];
  }
  
  public String selectPreposition()
  {
    index = random.nextInt(prepositions.length);
    return prepositions[index];
  }
  
  public String selectArticle()
  {
    return articles[0];
  }
  
}
  
  