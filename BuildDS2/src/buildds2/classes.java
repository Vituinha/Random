/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildds2;

/**
 *
 * @author Toran
 */
public class classes {
    public class guerreiro{
        int vig = 7;
        int fot = 6;
        int vit = 6;
        int con = 6;
        int foa = 15;
        int dex = 11;
        int adp = 5;
        int ing = 5;
        int fe = 5;
        int lvl = 12;
    }
    
    public class cavaleiro{
        int vig = 12;
        int fot = 6;
        int vit = 7;
        int con = 4;
        int foa = 11;
        int dex = 8;
        int adp = 9;
        int ing = 3;
        int fe = 6;
        int lvl = 13;
    }
    
    public class espadachim{
        int vig = 4;
        int fot = 8;
        int vit = 4;
        int con = 6;
        int foa = 9;
        int dex = 16;
        int adp = 6;
        int ing = 7;
        int fe = 5; 
        int lvl = 12;
    }
    
    public class bandoleiro{
        int vig = 9;
        int fot = 7;
        int vit = 11;
        int con = 2;
        int foa = 9;
        int dex = 14;
        int adp = 3;
        int ing = 1;
        int fe = 8; 
        int lvl = 11;
    }
    
    public class clerigo{
        int vig = 10;
        int fot = 3;
        int vit = 8;
        int con = 10;
        int foa = 11;
        int dex = 5;
        int adp = 4;
        int ing = 4;
        int fe = 12; 
        int lvl = 14;
    }
    
    public class feiticeiro{
        int vig = 5;
        int fot = 6;
        int vit = 5;
        int con = 12;
        int foa = 3;
        int dex = 7;
        int adp = 8;
        int ing = 14;
        int fe = 4; 
        int lvl = 11;
    }
    
    public class explorador{
        int vig = 7;
        int fot = 8;
        int vit = 9;
        int con = 7;
        int foa = 6;
        int dex = 6;
        int adp = 12;
        int ing = 5;
        int fe = 5; 
        int lvl = 10;
    }
    
    public class despojado{
        int vig = 6;
        int fot = 6;
        int vit = 6;
        int con = 6;
        int foa = 6;
        int dex = 6;
        int adp = 6;
        int ing = 6;
        int fe = 6; 
        int lvl = 1;
    }
    
    public String calc(int vigf,int fotf,int vitf,int conf,int foaf,int dexf,int adpf,int ingf,int fef, int lvlf)
    {
      if (vigf < 0)
        {
            vigf = 0;
        }
        else if (fotf < 0)
        {
            fotf = 0;
        }
        else if (vitf < 0)
        {
            vitf = 0;
        }
        else if (conf < 0)
        {
            conf = 0;
        }
        else if (foaf < 0)
        {
            foaf = 0;
        }
        else if (dexf < 0)
        {
            dexf = 0;
        }
        else if (adpf < 0)
        {
            adpf = 0;
        }
        else if (ingf < 0)
        {
            ingf = 0;
        }
        else if (fef < 0)
        {
            fef = 0;
        }
      int tot = vigf + fotf + vitf + conf + foaf + dexf + adpf + ingf + fef + lvlf;
      String resul = Integer.toString(tot);
        //System.out.print(resul);
        //System.out.println("");
      return resul;
    }
    public String gue(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        guerreiro gue = new guerreiro();
        vigf = a - gue.vig;
        fotf = b - gue.fot;
        vitf = c - gue.vit;
        conf = d - gue.con;
        foaf = e - gue.foa;
        dexf = f - gue.dex;
        adpf = g - gue.adp;
        ingf = h - gue.ing;
        fef = i - gue.fe;
        lvlf = gue.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;    
    }
    public String cav(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        cavaleiro cav = new cavaleiro();
        vigf = a - cav.vig;
        fotf = b - cav.fot;
        vitf = c - cav.vit;
        conf = d - cav.con;
        foaf = e - cav.foa;
        dexf = f - cav.dex;
        adpf = g - cav.adp;
        ingf = h - cav.ing;
        fef = i - cav.fe;
        lvlf = cav.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String esp(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        espadachim esp = new espadachim();
        vigf = a - esp.vig;
        fotf = b - esp.fot;
        vitf = c - esp.vit;
        conf = d - esp.con;
        foaf = e - esp.foa;
        dexf = f - esp.dex;
        adpf = g - esp.adp;
        ingf = h - esp.ing;
        fef = i - esp.fe;
        lvlf = esp.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String ban(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        bandoleiro ban = new bandoleiro();
        vigf = a - ban.vig;
        fotf = b - ban.fot;
        vitf = c - ban.vit;
        conf = d - ban.con;
        foaf = e - ban.foa;
        dexf = f - ban.dex;
        adpf = g - ban.adp;
        ingf = h - ban.ing;
        fef = i - ban.fe;
        lvlf = ban.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String cle(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        clerigo cle = new clerigo();
        vigf = a - cle.vig;
        fotf = b - cle.fot;
        vitf = c - cle.vit;
        conf = d - cle.con;
        foaf = e - cle.foa;
        dexf = f - cle.dex;
        adpf = g - cle.adp;
        ingf = h - cle.ing;
        fef = i - cle.fe;
        lvlf = cle.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String fei(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        feiticeiro fei = new feiticeiro();
        vigf = a - fei.vig;
        fotf = b - fei.fot;
        vitf = c - fei.vit;
        conf = d - fei.con;
        foaf = e - fei.foa;
        dexf = f - fei.dex;
        adpf = g - fei.adp;
        ingf = h - fei.ing;
        fef = i - fei.fe;
        lvlf = fei.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String exp(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        explorador exp = new explorador();
        vigf = a - exp.vig;
        fotf = b - exp.fot;
        vitf = c - exp.vit;
        conf = d - exp.con;
        foaf = e - exp.foa;
        dexf = f - exp.dex;
        adpf = g - exp.adp;
        ingf = h - exp.ing;
        fef = i - exp.fe;
        lvlf = exp.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    public String desp(int a, int b, int c, int d, int e, int f, int g, int h, int i)
    {
        int vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf;
        despojado desp = new despojado();
        vigf = a - desp.vig;
        fotf = b - desp.fot;
        vitf = c - desp.vit;
        conf = d - desp.con;
        foaf = e - desp.foa;
        dexf = f - desp.dex;
        adpf = g - desp.adp;
        ingf = h - desp.ing;
        fef = i - desp.fe;
        lvlf = desp.lvl;
        String resul = calc(vigf, fotf, vitf, conf, foaf, dexf, adpf, ingf, fef, lvlf);
        return resul;
    }
    
}
