package main;

import entity.CarDown1;
import entity.CarDown2;
import entity.CarUp1;
import entity.CarUp2;
import entity.NPC_Cat;
import entity.NPC_Chicken;
import java.security.PublicKey;

import object.OBJ_10;
import object.OBJ_103;
import object.OBJ_104;
import object.OBJ_105;
import object.OBJ_106;
import object.OBJ_107;
import object.OBJ_108;
import object.OBJ_109;
import object.OBJ_11;
import object.OBJ_110;
import object.OBJ_111;
import object.OBJ_112;
import object.OBJ_113;
import object.OBJ_115;
import object.OBJ_116;
import object.OBJ_118;
import object.OBJ_119;
import object.OBJ_12;
import object.OBJ_120;
import object.OBJ_121;
import object.OBJ_122;
import object.OBJ_123;
import object.OBJ_124;
import object.OBJ_125;
import object.OBJ_13;
import object.OBJ_14;
import object.OBJ_23;
import object.OBJ_24;
import object.OBJ_25;
import object.OBJ_26;
import object.OBJ_27;
import object.OBJ_28;
import object.OBJ_29;
import object.OBJ_30;
import object.OBJ_31;
import object.OBJ_32;
import object.OBJ_35;
import object.OBJ_36;
import object.OBJ_37;
import object.OBJ_38;
import object.OBJ_4;
import object.OBJ_42;
import object.OBJ_43;
import object.OBJ_44;
import object.OBJ_45;
import object.OBJ_46;
import object.OBJ_47;
import object.OBJ_48;
import object.OBJ_49;
import object.OBJ_5;
import object.OBJ_50;
import object.OBJ_51;
import object.OBJ_52;
import object.OBJ_53;
import object.OBJ_54;
import object.OBJ_55;
import object.OBJ_56;
import object.OBJ_57;
import object.OBJ_58;
import object.OBJ_59;
import object.OBJ_6;
import object.OBJ_60;
import object.OBJ_61;
import object.OBJ_62;
import object.OBJ_63;
import object.OBJ_64;
import object.OBJ_65;
import object.OBJ_66;
import object.OBJ_67;
import object.OBJ_7;
import object.OBJ_8;
import object.OBJ_88;
import object.OBJ_89;
import object.OBJ_9;
import object.OBJ_90;
import object.OBJ_96;
import object.OBJ_97;
import object.OBJ_98;
import object.OBJ_1;
import object.OBJ_100;
import object.OBJ_2;
import object.OBJ_3;
import object.OBJ_126;
import object.OBJ_127;
import object.OBJ_99;
import object.OBJ_Egg;
import object.OBJ_Eunji;

public class AssetSetter {

    GamePanel gp;

    public AssetSetter(GamePanel gp) {

        this.gp = gp;

    }

    public void setNPC() {
        
        gp.npc[0] = new CarDown1(gp);
        gp.npc[0].worldX = gp.tileSize * 16;
        gp.npc[0].worldY = gp.tileSize * -1;
        
        gp.npc[1] = new CarDown2(gp);
        gp.npc[1].worldX = gp.tileSize * 16;
        gp.npc[1].worldY = gp.tileSize * -2;
        
        gp.npc[2] = new CarDown1(gp);
        gp.npc[2].worldX = gp.tileSize * 15;
        gp.npc[2].worldY = gp.tileSize * -4;
        
        gp.npc[3] = new CarDown2(gp);
        gp.npc[3].worldX = gp.tileSize * 15;
        gp.npc[3].worldY = gp.tileSize * -5;
        
        gp.npc[4] = new CarDown1(gp);
        gp.npc[4].worldX = gp.tileSize * 16;
        gp.npc[4].worldY = gp.tileSize * -5;
        
        gp.npc[5] = new CarDown2(gp);
        gp.npc[5].worldX = gp.tileSize * 16;
        gp.npc[5].worldY = gp.tileSize * -6;
        
        gp.npc[6] = new CarDown1(gp);
        gp.npc[6].worldX = gp.tileSize * 16;
        gp.npc[6].worldY = gp.tileSize * -7;
        
        gp.npc[7] = new CarDown2(gp);
        gp.npc[7].worldX = gp.tileSize * 16;
        gp.npc[7].worldY = gp.tileSize * -8;
        
        gp.npc[8] = new CarDown1(gp);
        gp.npc[8].worldX = gp.tileSize * 15;
        gp.npc[8].worldY = gp.tileSize * -8;
        
        gp.npc[9] = new CarDown2(gp);
        gp.npc[9].worldX = gp.tileSize * 15;
        gp.npc[9].worldY = gp.tileSize * -9;

        gp.npc[10] = new CarDown1(gp);
        gp.npc[10].worldX = gp.tileSize * 16;
        gp.npc[10].worldY = gp.tileSize * -11;
        
        gp.npc[11] = new CarDown2(gp);
        gp.npc[11].worldX = gp.tileSize * 16;
        gp.npc[11].worldY = gp.tileSize * -12;
        
        gp.npc[12] = new CarDown1(gp);
        gp.npc[12].worldX = gp.tileSize * 15;
        gp.npc[12].worldY = gp.tileSize * -14;
        
        gp.npc[13] = new CarDown2(gp);
        gp.npc[13].worldX = gp.tileSize * 15;
        gp.npc[13].worldY = gp.tileSize * -15;
        
        gp.npc[14] = new CarDown1(gp);
        gp.npc[14].worldX = gp.tileSize * 16;
        gp.npc[14].worldY = gp.tileSize * -15;
        
        gp.npc[15] = new CarDown2(gp);
        gp.npc[15].worldX = gp.tileSize * 16;
        gp.npc[15].worldY = gp.tileSize * -16;
        
      
        
        gp.npc[30] = new CarDown1(gp);
        gp.npc[30].worldX = gp.tileSize * 15;
        gp.npc[30].worldY = gp.tileSize * -28;
        
        gp.npc[31] = new CarDown2(gp);
        gp.npc[31].worldX = gp.tileSize * 15;
        gp.npc[31].worldY = gp.tileSize * -29;
        
        gp.npc[32] = new CarDown1(gp);
        gp.npc[32].worldX = gp.tileSize * 15;
        gp.npc[32].worldY = gp.tileSize * -40;
        
        gp.npc[33] = new CarDown2(gp);
        gp.npc[33].worldX = gp.tileSize * 15;
        gp.npc[33].worldY = gp.tileSize * -41;
        
        gp.npc[34] = new CarDown1(gp);
        gp.npc[34].worldX = gp.tileSize * 16;
        gp.npc[34].worldY = gp.tileSize * -27;
        
        gp.npc[35] = new CarDown2(gp);
        gp.npc[35].worldX = gp.tileSize * 16;
        gp.npc[35].worldY = gp.tileSize * -28;
        
        gp.npc[36] = new CarDown1(gp);
        gp.npc[36].worldX = gp.tileSize * 16;
        gp.npc[36].worldY = gp.tileSize * -17;
        
        gp.npc[37] = new CarDown2(gp);
        gp.npc[37].worldX = gp.tileSize * 16;
        gp.npc[37].worldY = gp.tileSize * -18;
        
        gp.npc[38] = new CarDown1(gp);
        gp.npc[38].worldX = gp.tileSize * 15;
        gp.npc[38].worldY = gp.tileSize * -38;
        
        gp.npc[39] = new CarDown2(gp);
        gp.npc[39].worldX = gp.tileSize * 15;
        gp.npc[39].worldY = gp.tileSize * -39;

        gp.npc[40] = new CarDown1(gp);
        gp.npc[40].worldX = gp.tileSize * 16;
        gp.npc[40].worldY = gp.tileSize * -21;
        
        gp.npc[41] = new CarDown2(gp);
        gp.npc[41].worldX = gp.tileSize * 16;
        gp.npc[41].worldY = gp.tileSize * -22;
        
        gp.npc[42] = new CarDown1(gp);
        gp.npc[42].worldX = gp.tileSize * 15;
        gp.npc[42].worldY = gp.tileSize * -34;
        
        gp.npc[43] = new CarDown2(gp);
        gp.npc[43].worldX = gp.tileSize * 15;
        gp.npc[43].worldY = gp.tileSize * -35;
        
        gp.npc[44] = new CarDown1(gp);
        gp.npc[44].worldX = gp.tileSize * 16;
        gp.npc[44].worldY = gp.tileSize * -25;
        
        gp.npc[45] = new CarDown2(gp);
        gp.npc[45].worldX = gp.tileSize * 16;
        gp.npc[45].worldY = gp.tileSize * -26;
        
        gp.npc[46] = new CarUp1(gp);
        gp.npc[46].worldX = gp.tileSize * 18;
        gp.npc[46].worldY = gp.tileSize * 81;
        
        gp.npc[47] = new CarUp2(gp);
        gp.npc[47].worldX = gp.tileSize * 18;
        gp.npc[47].worldY = gp.tileSize * 80;
        
        gp.npc[48] = new CarUp1(gp);
        gp.npc[48].worldX = gp.tileSize * 18;
        gp.npc[48].worldY = gp.tileSize * 94;
        
        gp.npc[49] = new CarUp2(gp);
        gp.npc[49].worldX = gp.tileSize * 18;
        gp.npc[49].worldY = gp.tileSize * 93;
        
        gp.npc[50] = new CarUp1(gp);
        gp.npc[50].worldX = gp.tileSize * 17;
        gp.npc[50].worldY = gp.tileSize * 97;
        
        gp.npc[51] = new CarUp2(gp);
        gp.npc[51].worldX = gp.tileSize * 17;
        gp.npc[51].worldY = gp.tileSize * 96;
        
        gp.npc[52] = new CarUp1(gp);
        gp.npc[52].worldX = gp.tileSize * 18;
        gp.npc[52].worldY = gp.tileSize * 78;
        
        gp.npc[53] = new CarUp2(gp);
        gp.npc[53].worldX = gp.tileSize * 18;
        gp.npc[53].worldY = gp.tileSize * 77;
        
        gp.npc[54] = new CarUp1(gp);
        gp.npc[54].worldX = gp.tileSize * 18;
        gp.npc[54].worldY = gp.tileSize * 86;
        
        gp.npc[55] = new CarUp2(gp);
        gp.npc[55].worldX = gp.tileSize * 18;
        gp.npc[55].worldY = gp.tileSize * 85;
        
        gp.npc[56] = new CarUp1(gp);
        gp.npc[56].worldX = gp.tileSize * 17;
        gp.npc[56].worldY = gp.tileSize * 83;
        
        gp.npc[57] = new CarUp2(gp);
        gp.npc[57].worldX = gp.tileSize * 17;
        gp.npc[57].worldY = gp.tileSize * 82;
        
        gp.npc[58] = new CarUp1(gp);
        gp.npc[58].worldX = gp.tileSize * 17;
        gp.npc[58].worldY = gp.tileSize * 92;
        
        gp.npc[59] = new CarUp2(gp);
        gp.npc[59].worldX = gp.tileSize * 17;
        gp.npc[59].worldY = gp.tileSize * 91;

        gp.npc[60] = new NPC_Cat(gp);
        gp.npc[60].worldX = gp.tileSize * 14;
        gp.npc[60].worldY = gp.tileSize * 15;

        gp.npc[61] = new NPC_Cat(gp);
        gp.npc[61].worldX = gp.tileSize * 65;
        gp.npc[61].worldY = gp.tileSize * 40;

        gp.npc[62] = new NPC_Cat(gp);
        gp.npc[62].worldX = gp.tileSize * 84;
        gp.npc[62].worldY = gp.tileSize * 73;

        gp.npc[63] = new NPC_Chicken(gp);
        gp.npc[63].worldX = gp.tileSize * 81;
        gp.npc[63].worldY = gp.tileSize * 44;

        gp.npc[64] = new NPC_Chicken(gp);
        gp.npc[64].worldX = gp.tileSize * 80;
        gp.npc[64].worldY = gp.tileSize * 48;

        gp.npc[65] = new NPC_Chicken(gp);
        gp.npc[65].worldX = gp.tileSize * 81;
        gp.npc[65].worldY = gp.tileSize * 44;

        gp.npc[66] = new NPC_Chicken(gp);
        gp.npc[66].worldX = gp.tileSize * 84;
        gp.npc[66].worldY = gp.tileSize * 58;

        gp.npc[67] = new NPC_Chicken(gp);
        gp.npc[67].worldX = gp.tileSize * 78;
        gp.npc[67].worldY = gp.tileSize * 54;
        
        gp.npc[68] = new NPC_Chicken(gp);
        gp.npc[68].worldX = gp.tileSize * 14;
        gp.npc[68].worldY = gp.tileSize * 30;

    }

    public void setMonster() {
//        gp.monster[0] = new MON_Dog(gp);
//        gp.monster[0].worldX = gp.tileSize * 13;
//        gp.monster[0].worldY = gp.tileSize * 10;
//        
//        gp.monster[1] = new MON_Dog(gp);
//        gp.monster[1].worldX = gp.tileSize * 13;
//        gp.monster[1].worldY = gp.tileSize * 25;

    }

    public void setObject() {

        gp.obj[1287] = new OBJ_Eunji(gp);
        gp.obj[1287].worldX = 13 * gp.tileSize;
        gp.obj[1287].worldY = 8 * gp.tileSize;

        //=====================================
        //หัวดับเพลิง
        //=====================================
        gp.obj[610] = new OBJ_4();
        // ตำแหน่ง column
        gp.obj[610].worldX = 14 * gp.tileSize;
        // ตำแหน่ง row
        gp.obj[610].worldY = 7 * gp.tileSize;

        //=====================================
        gp.obj[611] = new OBJ_4();
        gp.obj[611].worldX = 14 * gp.tileSize;
        gp.obj[611].worldY = 43 * gp.tileSize;

        //=====================================
        gp.obj[612] = new OBJ_4();
        gp.obj[612].worldX = 38 * gp.tileSize;
        gp.obj[612].worldY = 30 * gp.tileSize;

        //=====================================
        gp.obj[613] = new OBJ_4();
        gp.obj[613].worldX = 7 * gp.tileSize;
        gp.obj[613].worldY = 48 * gp.tileSize;

        //=====================================
        gp.obj[614] = new OBJ_4();
        gp.obj[614].worldX = 39 * gp.tileSize;
        gp.obj[614].worldY = 47 * gp.tileSize;

        //=====================================
        gp.obj[615] = new OBJ_4();
        gp.obj[615].worldX = 49 * gp.tileSize;
        gp.obj[615].worldY = 49 * gp.tileSize;

        //=====================================
        // กรวยจราจร
        //=====================================
        gp.obj[616] = new OBJ_6();
        gp.obj[616].worldX = 11 * gp.tileSize;
        gp.obj[616].worldY = 23 * gp.tileSize;

        //=====================================
        gp.obj[617] = new OBJ_6();
        gp.obj[617].worldX = 12 * gp.tileSize;
        gp.obj[617].worldY = 23 * gp.tileSize;

        //=====================================
        gp.obj[618] = new OBJ_6();
        gp.obj[618].worldX = 12 * gp.tileSize;
        gp.obj[618].worldY = 24 * gp.tileSize;

        //=====================================
        gp.obj[619] = new OBJ_6();
        gp.obj[619].worldX = 11 * gp.tileSize;
        gp.obj[619].worldY = 25 * gp.tileSize;

        //=====================================
        gp.obj[620] = new OBJ_6();
        gp.obj[620].worldX = 12 * gp.tileSize;
        gp.obj[620].worldY = 25 * gp.tileSize;

        //=====================================
        //เสาไฟหันขวา
        //=====================================
        //ต้นที่ 1
        //=====================================
        gp.obj[621] = new OBJ_11();
        gp.obj[621].worldX = 11 * gp.tileSize;
        gp.obj[621].worldY = 11 * gp.tileSize;

        gp.obj[622] = new OBJ_12();
        gp.obj[622].worldX = 12 * gp.tileSize;
        gp.obj[622].worldY = 11 * gp.tileSize;

        gp.obj[623] = new OBJ_10();
        gp.obj[623].worldX = 11 * gp.tileSize;
        gp.obj[623].worldY = 12 * gp.tileSize;

        gp.obj[624] = new OBJ_9();
        gp.obj[624].worldX = 11 * gp.tileSize;
        gp.obj[624].worldY = 13 * gp.tileSize;

        //ต้นที่ 2
        //=====================================
        gp.obj[625] = new OBJ_11();
        gp.obj[625].worldX = 11 * gp.tileSize;
        gp.obj[625].worldY = 29 * gp.tileSize;

        gp.obj[626] = new OBJ_12();
        gp.obj[626].worldX = 12 * gp.tileSize;
        gp.obj[626].worldY = 29 * gp.tileSize;

        gp.obj[627] = new OBJ_10();
        gp.obj[627].worldX = 11 * gp.tileSize;
        gp.obj[627].worldY = 30 * gp.tileSize;

        gp.obj[628] = new OBJ_9();
        gp.obj[628].worldX = 11 * gp.tileSize;
        gp.obj[628].worldY = 31 * gp.tileSize;

        //ต้นที่ 3
        //=====================================
        gp.obj[629] = new OBJ_11();
        gp.obj[629].worldX = 11 * gp.tileSize;
        gp.obj[629].worldY = 44 * gp.tileSize;

        gp.obj[630] = new OBJ_12();
        gp.obj[630].worldX = 12 * gp.tileSize;
        gp.obj[630].worldY = 44 * gp.tileSize;

        gp.obj[631] = new OBJ_10();
        gp.obj[631].worldX = 11 * gp.tileSize;
        gp.obj[631].worldY = 45 * gp.tileSize;

        gp.obj[632] = new OBJ_9();
        gp.obj[632].worldX = 11 * gp.tileSize;
        gp.obj[632].worldY = 46 * gp.tileSize;

        //ต้นที่ 4
        //=====================================
        gp.obj[633] = new OBJ_11();
        gp.obj[633].worldX = 11 * gp.tileSize;
        gp.obj[633].worldY = 63 * gp.tileSize;

        gp.obj[634] = new OBJ_12();
        gp.obj[634].worldX = 12 * gp.tileSize;
        gp.obj[634].worldY = 63 * gp.tileSize;

        gp.obj[635] = new OBJ_10();
        gp.obj[635].worldX = 11 * gp.tileSize;
        gp.obj[635].worldY = 64 * gp.tileSize;

        gp.obj[636] = new OBJ_9();
        gp.obj[636].worldX = 11 * gp.tileSize;
        gp.obj[636].worldY = 65 * gp.tileSize;

        //ต้นที่ 5
        //=====================================
        gp.obj[637] = new OBJ_11();
        gp.obj[637].worldX = 30 * gp.tileSize;
        gp.obj[637].worldY = 47 * gp.tileSize;

        gp.obj[638] = new OBJ_12();
        gp.obj[638].worldX = 31 * gp.tileSize;
        gp.obj[638].worldY = 47 * gp.tileSize;

        gp.obj[639] = new OBJ_10();
        gp.obj[639].worldX = 30 * gp.tileSize;
        gp.obj[639].worldY = 48 * gp.tileSize;

        gp.obj[640] = new OBJ_9();
        gp.obj[640].worldX = 30 * gp.tileSize;
        gp.obj[640].worldY = 49 * gp.tileSize;

        //ต้นที่ 6
        //=====================================
        gp.obj[641] = new OBJ_11();
        gp.obj[641].worldX = 62 * gp.tileSize;
        gp.obj[641].worldY = 59 * gp.tileSize;

        gp.obj[642] = new OBJ_12();
        gp.obj[642].worldX = 63 * gp.tileSize;
        gp.obj[642].worldY = 59 * gp.tileSize;

        gp.obj[643] = new OBJ_10();
        gp.obj[643].worldX = 62 * gp.tileSize;
        gp.obj[643].worldY = 60 * gp.tileSize;

        gp.obj[644] = new OBJ_9();
        gp.obj[644].worldX = 62 * gp.tileSize;
        gp.obj[644].worldY = 61 * gp.tileSize;

        //ต้นที่ 7
        //=====================================
        gp.obj[645] = new OBJ_11();
        gp.obj[645].worldX = 62 * gp.tileSize;
        gp.obj[645].worldY = 69 * gp.tileSize;

        gp.obj[646] = new OBJ_12();
        gp.obj[646].worldX = 63 * gp.tileSize;
        gp.obj[646].worldY = 69 * gp.tileSize;

        gp.obj[647] = new OBJ_10();
        gp.obj[647].worldX = 62 * gp.tileSize;
        gp.obj[647].worldY = 70 * gp.tileSize;

        gp.obj[648] = new OBJ_9();
        gp.obj[648].worldX = 62 * gp.tileSize;
        gp.obj[648].worldY = 71 * gp.tileSize;

        //=====================================
        //เสาไฟหันซ้าย
        //=====================================
        //ต้นที่ 1
        //=====================================
        gp.obj[649] = new OBJ_13();
        gp.obj[649].worldX = 40 * gp.tileSize;
        gp.obj[649].worldY = 9 * gp.tileSize;

        gp.obj[650] = new OBJ_14();
        gp.obj[650].worldX = 39 * gp.tileSize;
        gp.obj[650].worldY = 9 * gp.tileSize;

        gp.obj[651] = new OBJ_10();
        gp.obj[651].worldX = 40 * gp.tileSize;
        gp.obj[651].worldY = 10 * gp.tileSize;

        gp.obj[652] = new OBJ_9();
        gp.obj[652].worldX = 40 * gp.tileSize;
        gp.obj[652].worldY = 11 * gp.tileSize;

        //ต้นที่ 2
        //=====================================
        gp.obj[653] = new OBJ_13();
        gp.obj[653].worldX = 40 * gp.tileSize;
        gp.obj[653].worldY = 26 * gp.tileSize;

        gp.obj[654] = new OBJ_14();
        gp.obj[654].worldX = 39 * gp.tileSize;
        gp.obj[654].worldY = 26 * gp.tileSize;

        gp.obj[655] = new OBJ_10();
        gp.obj[655].worldX = 40 * gp.tileSize;
        gp.obj[655].worldY = 27 * gp.tileSize;

        gp.obj[656] = new OBJ_9();
        gp.obj[656].worldX = 40 * gp.tileSize;
        gp.obj[656].worldY = 28 * gp.tileSize;

        //ต้นที่ 3
        //=====================================
        gp.obj[657] = new OBJ_13();
        gp.obj[657].worldX = 40 * gp.tileSize;
        gp.obj[657].worldY = 42 * gp.tileSize;

        gp.obj[658] = new OBJ_14();
        gp.obj[658].worldX = 39 * gp.tileSize;
        gp.obj[658].worldY = 42 * gp.tileSize;

        gp.obj[659] = new OBJ_10();
        gp.obj[659].worldX = 40 * gp.tileSize;
        gp.obj[659].worldY = 43 * gp.tileSize;

        gp.obj[660] = new OBJ_9();
        gp.obj[660].worldX = 40 * gp.tileSize;
        gp.obj[660].worldY = 44 * gp.tileSize;

        //ต้นที่ 4
        //=====================================
        gp.obj[661] = new OBJ_13();
        gp.obj[661].worldX = 65 * gp.tileSize;
        gp.obj[661].worldY = 64 * gp.tileSize;

        gp.obj[662] = new OBJ_14();
        gp.obj[662].worldX = 64 * gp.tileSize;
        gp.obj[662].worldY = 64 * gp.tileSize;

        gp.obj[893] = new OBJ_10();
        gp.obj[893].worldX = 65 * gp.tileSize;
        gp.obj[893].worldY = 65 * gp.tileSize;

        gp.obj[894] = new OBJ_9();
        gp.obj[894].worldX = 65 * gp.tileSize;
        gp.obj[894].worldY = 66 * gp.tileSize;

        //ต้นที่ 5
        //=====================================
        gp.obj[895] = new OBJ_13();
        gp.obj[895].worldX = 65 * gp.tileSize;
        gp.obj[895].worldY = 79 * gp.tileSize;

        gp.obj[896] = new OBJ_14();
        gp.obj[896].worldX = 64 * gp.tileSize;
        gp.obj[896].worldY = 79 * gp.tileSize;

        gp.obj[897] = new OBJ_10();
        gp.obj[897].worldX = 65 * gp.tileSize;
        gp.obj[897].worldY = 80 * gp.tileSize;

        gp.obj[898] = new OBJ_9();
        gp.obj[898].worldX = 65 * gp.tileSize;
        gp.obj[898].worldY = 81 * gp.tileSize;

        //ต้นที่ 6
        //=====================================
        gp.obj[899] = new OBJ_13();
        gp.obj[899].worldX = 72 * gp.tileSize;
        gp.obj[899].worldY = 87 * gp.tileSize;

        gp.obj[900] = new OBJ_14();
        gp.obj[900].worldX = 71 * gp.tileSize;
        gp.obj[900].worldY = 87 * gp.tileSize;

        gp.obj[901] = new OBJ_10();
        gp.obj[901].worldX = 72 * gp.tileSize;
        gp.obj[901].worldY = 88 * gp.tileSize;

        gp.obj[902] = new OBJ_9();
        gp.obj[902].worldX = 72 * gp.tileSize;
        gp.obj[902].worldY = 89 * gp.tileSize;

        //=====================================
        //ต้นไม้ใหญ่ 2
        //=====================================
        gp.obj[913] = new OBJ_29();
        gp.obj[913].worldX = 60 * gp.tileSize;
        gp.obj[913].worldY = 44 * gp.tileSize;

        gp.obj[914] = new OBJ_30();
        gp.obj[914].worldX = 61 * gp.tileSize;
        gp.obj[914].worldY = 44 * gp.tileSize;

        gp.obj[915] = new OBJ_31();
        gp.obj[915].worldX = 60 * gp.tileSize;
        gp.obj[915].worldY = 45 * gp.tileSize;

        gp.obj[916] = new OBJ_32();
        gp.obj[916].worldX = 61 * gp.tileSize;
        gp.obj[916].worldY = 45 * gp.tileSize;

        gp.obj[917] = new OBJ_27();
        gp.obj[917].worldX = 60 * gp.tileSize;
        gp.obj[917].worldY = 44 * gp.tileSize;

        gp.obj[918] = new OBJ_28();
        gp.obj[918].worldX = 61 * gp.tileSize;
        gp.obj[918].worldY = 44 * gp.tileSize;

        gp.obj[919] = new OBJ_25();
        gp.obj[919].worldX = 60 * gp.tileSize;
        gp.obj[919].worldY = 43 * gp.tileSize;

        gp.obj[920] = new OBJ_26();
        gp.obj[920].worldX = 61 * gp.tileSize;
        gp.obj[920].worldY = 43 * gp.tileSize;

        gp.obj[921] = new OBJ_23();
        gp.obj[921].worldX = 60 * gp.tileSize;
        gp.obj[921].worldY = 42 * gp.tileSize;

        gp.obj[922] = new OBJ_24();
        gp.obj[922].worldX = 61 * gp.tileSize;
        gp.obj[922].worldY = 42 * gp.tileSize;

        //=====================================
        //ต้นไม้ใหญ่ 3
        //=====================================
        gp.obj[923] = new OBJ_29();
        gp.obj[923].worldX = 64 * gp.tileSize;
        gp.obj[923].worldY = 44 * gp.tileSize;

        gp.obj[924] = new OBJ_30();
        gp.obj[924].worldX = 65 * gp.tileSize;
        gp.obj[924].worldY = 44 * gp.tileSize;

        gp.obj[925] = new OBJ_31();
        gp.obj[925].worldX = 64 * gp.tileSize;
        gp.obj[925].worldY = 45 * gp.tileSize;

        gp.obj[926] = new OBJ_32();
        gp.obj[926].worldX = 65 * gp.tileSize;
        gp.obj[926].worldY = 45 * gp.tileSize;

        gp.obj[927] = new OBJ_27();
        gp.obj[927].worldX = 64 * gp.tileSize;
        gp.obj[927].worldY = 44 * gp.tileSize;

        gp.obj[928] = new OBJ_28();
        gp.obj[928].worldX = 65 * gp.tileSize;
        gp.obj[928].worldY = 44 * gp.tileSize;

        gp.obj[929] = new OBJ_25();
        gp.obj[929].worldX = 64 * gp.tileSize;
        gp.obj[929].worldY = 43 * gp.tileSize;

        gp.obj[930] = new OBJ_26();
        gp.obj[930].worldX = 65 * gp.tileSize;
        gp.obj[930].worldY = 43 * gp.tileSize;

        gp.obj[931] = new OBJ_23();
        gp.obj[931].worldX = 64 * gp.tileSize;
        gp.obj[931].worldY = 42 * gp.tileSize;

        gp.obj[932] = new OBJ_24();
        gp.obj[932].worldX = 65 * gp.tileSize;
        gp.obj[932].worldY = 42 * gp.tileSize;

        //=====================================
        //ดอกไม้
        //=====================================
        gp.obj[933] = new OBJ_98();
        gp.obj[933].worldX = 59 * gp.tileSize;
        gp.obj[933].worldY = 43 * gp.tileSize;

        gp.obj[934] = new OBJ_98();
        gp.obj[934].worldX = 59 * gp.tileSize;
        gp.obj[934].worldY = 44 * gp.tileSize;

        gp.obj[935] = new OBJ_98();
        gp.obj[935].worldX = 59 * gp.tileSize;
        gp.obj[935].worldY = 45 * gp.tileSize;

        gp.obj[936] = new OBJ_98();
        gp.obj[936].worldX = 59 * gp.tileSize;
        gp.obj[936].worldY = 46 * gp.tileSize;

        gp.obj[937] = new OBJ_98();
        gp.obj[937].worldX = 60 * gp.tileSize;
        gp.obj[937].worldY = 46 * gp.tileSize;

        gp.obj[938] = new OBJ_98();
        gp.obj[938].worldX = 61 * gp.tileSize;
        gp.obj[938].worldY = 46 * gp.tileSize;

        gp.obj[939] = new OBJ_98();
        gp.obj[939].worldX = 62 * gp.tileSize;
        gp.obj[939].worldY = 43 * gp.tileSize;

        gp.obj[940] = new OBJ_98();
        gp.obj[940].worldX = 62 * gp.tileSize;
        gp.obj[940].worldY = 44 * gp.tileSize;

        gp.obj[941] = new OBJ_98();
        gp.obj[941].worldX = 62 * gp.tileSize;
        gp.obj[941].worldY = 45 * gp.tileSize;

        gp.obj[942] = new OBJ_98();
        gp.obj[942].worldX = 62 * gp.tileSize;
        gp.obj[942].worldY = 46 * gp.tileSize;

        gp.obj[943] = new OBJ_98();
        gp.obj[943].worldX = 63 * gp.tileSize;
        gp.obj[943].worldY = 43 * gp.tileSize;

        gp.obj[944] = new OBJ_98();
        gp.obj[944].worldX = 63 * gp.tileSize;
        gp.obj[944].worldY = 44 * gp.tileSize;

        gp.obj[945] = new OBJ_98();
        gp.obj[945].worldX = 63 * gp.tileSize;
        gp.obj[945].worldY = 45 * gp.tileSize;

        gp.obj[946] = new OBJ_98();
        gp.obj[946].worldX = 63 * gp.tileSize;
        gp.obj[946].worldY = 46 * gp.tileSize;

        gp.obj[947] = new OBJ_98();
        gp.obj[947].worldX = 64 * gp.tileSize;
        gp.obj[947].worldY = 46 * gp.tileSize;

        gp.obj[948] = new OBJ_98();
        gp.obj[948].worldX = 65 * gp.tileSize;
        gp.obj[948].worldY = 46 * gp.tileSize;

        gp.obj[949] = new OBJ_98();
        gp.obj[949].worldX = 66 * gp.tileSize;
        gp.obj[949].worldY = 43 * gp.tileSize;

        gp.obj[950] = new OBJ_98();
        gp.obj[950].worldX = 66 * gp.tileSize;
        gp.obj[950].worldY = 44 * gp.tileSize;

        gp.obj[951] = new OBJ_98();
        gp.obj[951].worldX = 66 * gp.tileSize;
        gp.obj[951].worldY = 45 * gp.tileSize;

        gp.obj[952] = new OBJ_98();
        gp.obj[952].worldX = 66 * gp.tileSize;
        gp.obj[952].worldY = 46 * gp.tileSize;

        // น้องหญ้า 103 ติดกับ tile 53
        gp.obj[953] = new OBJ_103();
        gp.obj[953].worldX = 57 * gp.tileSize;
        gp.obj[953].worldY = 41 * gp.tileSize;

        gp.obj[954] = new OBJ_103();
        gp.obj[954].worldX = 58 * gp.tileSize;
        gp.obj[954].worldY = 41 * gp.tileSize;

        gp.obj[955] = new OBJ_103();
        gp.obj[955].worldX = 59 * gp.tileSize;
        gp.obj[955].worldY = 41 * gp.tileSize;

        gp.obj[956] = new OBJ_103();
        gp.obj[956].worldX = 60 * gp.tileSize;
        gp.obj[956].worldY = 41 * gp.tileSize;

        gp.obj[957] = new OBJ_103();
        gp.obj[957].worldX = 61 * gp.tileSize;
        gp.obj[957].worldY = 41 * gp.tileSize;

        gp.obj[958] = new OBJ_103();
        gp.obj[958].worldX = 62 * gp.tileSize;
        gp.obj[958].worldY = 41 * gp.tileSize;

        gp.obj[959] = new OBJ_103();
        gp.obj[959].worldX = 63 * gp.tileSize;
        gp.obj[959].worldY = 41 * gp.tileSize;

        gp.obj[960] = new OBJ_103();
        gp.obj[960].worldX = 64 * gp.tileSize;
        gp.obj[960].worldY = 41 * gp.tileSize;

        gp.obj[961] = new OBJ_103();
        gp.obj[961].worldX = 65 * gp.tileSize;
        gp.obj[961].worldY = 41 * gp.tileSize;

        gp.obj[962] = new OBJ_103();
        gp.obj[962].worldX = 66 * gp.tileSize;
        gp.obj[962].worldY = 41 * gp.tileSize;

        gp.obj[963] = new OBJ_103();
        gp.obj[963].worldX = 67 * gp.tileSize;
        gp.obj[963].worldY = 41 * gp.tileSize;

        gp.obj[964] = new OBJ_103();
        gp.obj[964].worldX = 68 * gp.tileSize;
        gp.obj[964].worldY = 41 * gp.tileSize;

        gp.obj[965] = new OBJ_103();
        gp.obj[965].worldX = 69 * gp.tileSize;
        gp.obj[965].worldY = 41 * gp.tileSize;

        gp.obj[966] = new OBJ_103();
        gp.obj[966].worldX = 70 * gp.tileSize;
        gp.obj[966].worldY = 41 * gp.tileSize;

        gp.obj[967] = new OBJ_103();
        gp.obj[967].worldX = 71 * gp.tileSize;
        gp.obj[967].worldY = 41 * gp.tileSize;

        gp.obj[968] = new OBJ_103();
        gp.obj[968].worldX = 72 * gp.tileSize;
        gp.obj[968].worldY = 41 * gp.tileSize;

        gp.obj[969] = new OBJ_103();
        gp.obj[969].worldX = 73 * gp.tileSize;
        gp.obj[969].worldY = 41 * gp.tileSize;

        gp.obj[970] = new OBJ_103();
        gp.obj[970].worldX = 74 * gp.tileSize;
        gp.obj[970].worldY = 41 * gp.tileSize;

        gp.obj[971] = new OBJ_103();
        gp.obj[971].worldX = 75 * gp.tileSize;
        gp.obj[971].worldY = 41 * gp.tileSize;

        gp.obj[972] = new OBJ_103();
        gp.obj[972].worldX = 76 * gp.tileSize;
        gp.obj[972].worldY = 41 * gp.tileSize;

        // โค้งน้องหญ้า
        gp.obj[973] = new OBJ_104();
        gp.obj[973].worldX = 77 * gp.tileSize;
        gp.obj[973].worldY = 41 * gp.tileSize;

        gp.obj[974] = new OBJ_108();
        gp.obj[974].worldX = 77 * gp.tileSize;
        gp.obj[974].worldY = 42 * gp.tileSize;

        gp.obj[975] = new OBJ_108();
        gp.obj[975].worldX = 77 * gp.tileSize;
        gp.obj[975].worldY = 43 * gp.tileSize;

        gp.obj[976] = new OBJ_108();
        gp.obj[976].worldX = 77 * gp.tileSize;
        gp.obj[976].worldY = 44 * gp.tileSize;

        gp.obj[977] = new OBJ_108();
        gp.obj[977].worldX = 77 * gp.tileSize;
        gp.obj[977].worldY = 45 * gp.tileSize;

        gp.obj[978] = new OBJ_111();
        gp.obj[978].worldX = 77 * gp.tileSize;
        gp.obj[978].worldY = 46 * gp.tileSize;

        gp.obj[979] = new OBJ_103();
        gp.obj[979].worldX = 78 * gp.tileSize;
        gp.obj[979].worldY = 46 * gp.tileSize;

        // โค้งน้องหญ้า
        gp.obj[980] = new OBJ_104();
        gp.obj[980].worldX = 79 * gp.tileSize;
        gp.obj[980].worldY = 46 * gp.tileSize;

        gp.obj[981] = new OBJ_108();
        gp.obj[981].worldX = 79 * gp.tileSize;
        gp.obj[981].worldY = 47 * gp.tileSize;

        gp.obj[982] = new OBJ_108();
        gp.obj[982].worldX = 79 * gp.tileSize;
        gp.obj[982].worldY = 47 * gp.tileSize;

        gp.obj[983] = new OBJ_108();
        gp.obj[983].worldX = 79 * gp.tileSize;
        gp.obj[983].worldY = 48 * gp.tileSize;

        gp.obj[984] = new OBJ_108();
        gp.obj[984].worldX = 79 * gp.tileSize;
        gp.obj[984].worldY = 49 * gp.tileSize;

        gp.obj[985] = new OBJ_108();
        gp.obj[985].worldX = 79 * gp.tileSize;
        gp.obj[985].worldY = 50 * gp.tileSize;

        gp.obj[986] = new OBJ_108();
        gp.obj[986].worldX = 79 * gp.tileSize;
        gp.obj[986].worldY = 51 * gp.tileSize;

        gp.obj[912] = new OBJ_108();
        gp.obj[912].worldX = 79 * gp.tileSize;
        gp.obj[912].worldY = 52 * gp.tileSize;

        gp.obj[911] = new OBJ_108();
        gp.obj[911].worldX = 79 * gp.tileSize;
        gp.obj[911].worldY = 53 * gp.tileSize;

        gp.obj[910] = new OBJ_108();
        gp.obj[910].worldX = 79 * gp.tileSize;
        gp.obj[910].worldY = 54 * gp.tileSize;

        gp.obj[903] = new OBJ_108();
        gp.obj[903].worldX = 79 * gp.tileSize;
        gp.obj[903].worldY = 55 * gp.tileSize;

        gp.obj[904] = new OBJ_108();
        gp.obj[904].worldX = 79 * gp.tileSize;
        gp.obj[904].worldY = 56 * gp.tileSize;

        gp.obj[905] = new OBJ_108();
        gp.obj[905].worldX = 79 * gp.tileSize;
        gp.obj[905].worldY = 57 * gp.tileSize;

        gp.obj[906] = new OBJ_108();
        gp.obj[906].worldX = 79 * gp.tileSize;
        gp.obj[906].worldY = 58 * gp.tileSize;

        gp.obj[907] = new OBJ_108();
        gp.obj[907].worldX = 79 * gp.tileSize;
        gp.obj[907].worldY = 59 * gp.tileSize;

        gp.obj[908] = new OBJ_108();
        gp.obj[908].worldX = 79 * gp.tileSize;
        gp.obj[908].worldY = 60 * gp.tileSize;

        gp.obj[909] = new OBJ_108();
        gp.obj[909].worldX = 79 * gp.tileSize;
        gp.obj[909].worldY = 61 * gp.tileSize;

        gp.obj[157] = new OBJ_108();
        gp.obj[157].worldX = 79 * gp.tileSize;
        gp.obj[157].worldY = 62 * gp.tileSize;

        gp.obj[158] = new OBJ_108();
        gp.obj[158].worldX = 79 * gp.tileSize;
        gp.obj[158].worldY = 63 * gp.tileSize;

        gp.obj[159] = new OBJ_108();
        gp.obj[159].worldX = 79 * gp.tileSize;
        gp.obj[159].worldY = 64 * gp.tileSize;

        gp.obj[160] = new OBJ_106();
        gp.obj[160].worldX = 79 * gp.tileSize;
        gp.obj[160].worldY = 65 * gp.tileSize;

        gp.obj[161] = new OBJ_105();
        gp.obj[161].worldX = 78 * gp.tileSize;
        gp.obj[161].worldY = 65 * gp.tileSize;

        gp.obj[162] = new OBJ_105();
        gp.obj[162].worldX = 77 * gp.tileSize;
        gp.obj[162].worldY = 65 * gp.tileSize;

        gp.obj[163] = new OBJ_105();
        gp.obj[163].worldX = 76 * gp.tileSize;
        gp.obj[163].worldY = 65 * gp.tileSize;

        gp.obj[164] = new OBJ_105();
        gp.obj[164].worldX = 75 * gp.tileSize;
        gp.obj[164].worldY = 65 * gp.tileSize;

        gp.obj[165] = new OBJ_107();
        gp.obj[165].worldX = 74 * gp.tileSize;
        gp.obj[165].worldY = 65 * gp.tileSize;

        gp.obj[166] = new OBJ_109();
        gp.obj[166].worldX = 74 * gp.tileSize;
        gp.obj[166].worldY = 64 * gp.tileSize;

        gp.obj[167] = new OBJ_109();
        gp.obj[167].worldX = 74 * gp.tileSize;
        gp.obj[167].worldY = 63 * gp.tileSize;

        gp.obj[168] = new OBJ_109();
        gp.obj[168].worldX = 74 * gp.tileSize;
        gp.obj[168].worldY = 62 * gp.tileSize;

        gp.obj[169] = new OBJ_109();
        gp.obj[169].worldX = 74 * gp.tileSize;
        gp.obj[169].worldY = 61 * gp.tileSize;

        gp.obj[170] = new OBJ_109();
        gp.obj[170].worldX = 74 * gp.tileSize;
        gp.obj[170].worldY = 60 * gp.tileSize;

        gp.obj[171] = new OBJ_109();
        gp.obj[171].worldX = 74 * gp.tileSize;
        gp.obj[171].worldY = 59 * gp.tileSize;

        gp.obj[172] = new OBJ_109();
        gp.obj[172].worldX = 74 * gp.tileSize;
        gp.obj[172].worldY = 58 * gp.tileSize;

        gp.obj[173] = new OBJ_109();
        gp.obj[173].worldX = 74 * gp.tileSize;
        gp.obj[173].worldY = 57 * gp.tileSize;

        gp.obj[174] = new OBJ_109();
        gp.obj[174].worldX = 74 * gp.tileSize;
        gp.obj[174].worldY = 56 * gp.tileSize;

        gp.obj[175] = new OBJ_109();
        gp.obj[175].worldX = 74 * gp.tileSize;
        gp.obj[175].worldY = 55 * gp.tileSize;

        gp.obj[176] = new OBJ_109();
        gp.obj[176].worldX = 74 * gp.tileSize;
        gp.obj[176].worldY = 54 * gp.tileSize;

        gp.obj[177] = new OBJ_109();
        gp.obj[177].worldX = 74 * gp.tileSize;
        gp.obj[177].worldY = 53 * gp.tileSize;

        gp.obj[178] = new OBJ_109();
        gp.obj[178].worldX = 74 * gp.tileSize;
        gp.obj[178].worldY = 52 * gp.tileSize;

        gp.obj[179] = new OBJ_109();
        gp.obj[179].worldX = 74 * gp.tileSize;
        gp.obj[179].worldY = 51 * gp.tileSize;

        gp.obj[180] = new OBJ_109();
        gp.obj[180].worldX = 74 * gp.tileSize;
        gp.obj[180].worldY = 50 * gp.tileSize;

        gp.obj[181] = new OBJ_109();
        gp.obj[181].worldX = 74 * gp.tileSize;
        gp.obj[181].worldY = 49 * gp.tileSize;

        gp.obj[182] = new OBJ_109();
        gp.obj[182].worldX = 74 * gp.tileSize;
        gp.obj[182].worldY = 48 * gp.tileSize;

        // โค้งอีก
        gp.obj[183] = new OBJ_112();
        gp.obj[183].worldX = 74 * gp.tileSize;
        gp.obj[183].worldY = 47 * gp.tileSize;

        gp.obj[184] = new OBJ_105();
        gp.obj[184].worldX = 73 * gp.tileSize;
        gp.obj[184].worldY = 47 * gp.tileSize;

        gp.obj[185] = new OBJ_105();
        gp.obj[185].worldX = 72 * gp.tileSize;
        gp.obj[185].worldY = 47 * gp.tileSize;

        gp.obj[186] = new OBJ_105();
        gp.obj[186].worldX = 71 * gp.tileSize;
        gp.obj[186].worldY = 47 * gp.tileSize;

        gp.obj[187] = new OBJ_105();
        gp.obj[187].worldX = 70 * gp.tileSize;
        gp.obj[187].worldY = 47 * gp.tileSize;

        gp.obj[188] = new OBJ_105();
        gp.obj[188].worldX = 69 * gp.tileSize;
        gp.obj[188].worldY = 47 * gp.tileSize;

        gp.obj[189] = new OBJ_105();
        gp.obj[189].worldX = 68 * gp.tileSize;
        gp.obj[189].worldY = 47 * gp.tileSize;

        gp.obj[190] = new OBJ_105();
        gp.obj[190].worldX = 67 * gp.tileSize;
        gp.obj[190].worldY = 47 * gp.tileSize;

        gp.obj[191] = new OBJ_105();
        gp.obj[191].worldX = 66 * gp.tileSize;
        gp.obj[191].worldY = 47 * gp.tileSize;

        gp.obj[192] = new OBJ_105();
        gp.obj[192].worldX = 65 * gp.tileSize;
        gp.obj[192].worldY = 47 * gp.tileSize;

        gp.obj[193] = new OBJ_105();
        gp.obj[193].worldX = 64 * gp.tileSize;
        gp.obj[193].worldY = 47 * gp.tileSize;

        gp.obj[194] = new OBJ_105();
        gp.obj[194].worldX = 63 * gp.tileSize;
        gp.obj[194].worldY = 47 * gp.tileSize;

        gp.obj[195] = new OBJ_105();
        gp.obj[195].worldX = 62 * gp.tileSize;
        gp.obj[195].worldY = 47 * gp.tileSize;

        gp.obj[196] = new OBJ_105();
        gp.obj[196].worldX = 61 * gp.tileSize;
        gp.obj[196].worldY = 47 * gp.tileSize;

        gp.obj[197] = new OBJ_105();
        gp.obj[197].worldX = 60 * gp.tileSize;
        gp.obj[197].worldY = 47 * gp.tileSize;

        gp.obj[198] = new OBJ_105();
        gp.obj[198].worldX = 59 * gp.tileSize;
        gp.obj[198].worldY = 47 * gp.tileSize;

        gp.obj[199] = new OBJ_105();
        gp.obj[199].worldX = 58 * gp.tileSize;
        gp.obj[199].worldY = 47 * gp.tileSize;

        gp.obj[200] = new OBJ_105();
        gp.obj[200].worldX = 57 * gp.tileSize;
        gp.obj[200].worldY = 47 * gp.tileSize;

        // หญ้าข้างๆ คลินิก
        gp.obj[201] = new OBJ_110();
        gp.obj[201].worldX = 65 * gp.tileSize;
        gp.obj[201].worldY = 37 * gp.tileSize;

        gp.obj[202] = new OBJ_103();
        gp.obj[202].worldX = 66 * gp.tileSize;
        gp.obj[202].worldY = 37 * gp.tileSize;

        gp.obj[203] = new OBJ_103();
        gp.obj[203].worldX = 67 * gp.tileSize;
        gp.obj[203].worldY = 37 * gp.tileSize;

        gp.obj[204] = new OBJ_103();
        gp.obj[204].worldX = 68 * gp.tileSize;
        gp.obj[204].worldY = 37 * gp.tileSize;

        gp.obj[205] = new OBJ_103();
        gp.obj[205].worldX = 69 * gp.tileSize;
        gp.obj[205].worldY = 37 * gp.tileSize;

        gp.obj[206] = new OBJ_103();
        gp.obj[206].worldX = 70 * gp.tileSize;
        gp.obj[206].worldY = 37 * gp.tileSize;

        gp.obj[207] = new OBJ_103();
        gp.obj[207].worldX = 71 * gp.tileSize;
        gp.obj[207].worldY = 37 * gp.tileSize;

        gp.obj[208] = new OBJ_103();
        gp.obj[208].worldX = 72 * gp.tileSize;
        gp.obj[208].worldY = 37 * gp.tileSize;

        gp.obj[209] = new OBJ_103();
        gp.obj[209].worldX = 73 * gp.tileSize;
        gp.obj[209].worldY = 37 * gp.tileSize;

        gp.obj[210] = new OBJ_103();
        gp.obj[210].worldX = 74 * gp.tileSize;
        gp.obj[210].worldY = 37 * gp.tileSize;

        gp.obj[211] = new OBJ_103();
        gp.obj[211].worldX = 75 * gp.tileSize;
        gp.obj[211].worldY = 37 * gp.tileSize;

        gp.obj[212] = new OBJ_103();
        gp.obj[212].worldX = 76 * gp.tileSize;
        gp.obj[212].worldY = 37 * gp.tileSize;

        gp.obj[213] = new OBJ_104();
        gp.obj[213].worldX = 77 * gp.tileSize;
        gp.obj[213].worldY = 37 * gp.tileSize;

        gp.obj[214] = new OBJ_108();
        gp.obj[214].worldX = 77 * gp.tileSize;
        gp.obj[214].worldY = 38 * gp.tileSize;

        gp.obj[215] = new OBJ_106();
        gp.obj[215].worldX = 77 * gp.tileSize;
        gp.obj[215].worldY = 39 * gp.tileSize;

        gp.obj[216] = new OBJ_105();
        gp.obj[216].worldX = 76 * gp.tileSize;
        gp.obj[216].worldY = 39 * gp.tileSize;

        gp.obj[217] = new OBJ_105();
        gp.obj[217].worldX = 75 * gp.tileSize;
        gp.obj[217].worldY = 39 * gp.tileSize;

        gp.obj[218] = new OBJ_105();
        gp.obj[218].worldX = 74 * gp.tileSize;
        gp.obj[218].worldY = 39 * gp.tileSize;

        gp.obj[219] = new OBJ_105();
        gp.obj[219].worldX = 73 * gp.tileSize;
        gp.obj[219].worldY = 39 * gp.tileSize;

        gp.obj[220] = new OBJ_105();
        gp.obj[220].worldX = 72 * gp.tileSize;
        gp.obj[220].worldY = 39 * gp.tileSize;

        gp.obj[221] = new OBJ_105();
        gp.obj[221].worldX = 71 * gp.tileSize;
        gp.obj[221].worldY = 39 * gp.tileSize;

        gp.obj[222] = new OBJ_105();
        gp.obj[222].worldX = 70 * gp.tileSize;
        gp.obj[222].worldY = 39 * gp.tileSize;

        gp.obj[223] = new OBJ_105();
        gp.obj[223].worldX = 69 * gp.tileSize;
        gp.obj[223].worldY = 39 * gp.tileSize;

        gp.obj[224] = new OBJ_105();
        gp.obj[224].worldX = 68 * gp.tileSize;
        gp.obj[224].worldY = 39 * gp.tileSize;

        gp.obj[225] = new OBJ_105();
        gp.obj[225].worldX = 67 * gp.tileSize;
        gp.obj[225].worldY = 39 * gp.tileSize;

        gp.obj[226] = new OBJ_105();
        gp.obj[226].worldX = 66 * gp.tileSize;
        gp.obj[226].worldY = 39 * gp.tileSize;

        gp.obj[227] = new OBJ_107();
        gp.obj[227].worldX = 65 * gp.tileSize;
        gp.obj[227].worldY = 39 * gp.tileSize;

        gp.obj[228] = new OBJ_109();
        gp.obj[228].worldX = 65 * gp.tileSize;
        gp.obj[228].worldY = 38 * gp.tileSize;

        // ถัดจากหญ่้าที่อยู่ติดกับคลิินก
        gp.obj[229] = new OBJ_110();
        gp.obj[229].worldX = 80 * gp.tileSize;
        gp.obj[229].worldY = 37 * gp.tileSize;

        gp.obj[230] = new OBJ_103();
        gp.obj[230].worldX = 81 * gp.tileSize;
        gp.obj[230].worldY = 37 * gp.tileSize;

        gp.obj[231] = new OBJ_103();
        gp.obj[231].worldX = 82 * gp.tileSize;
        gp.obj[231].worldY = 37 * gp.tileSize;

        gp.obj[232] = new OBJ_103();
        gp.obj[232].worldX = 83 * gp.tileSize;
        gp.obj[232].worldY = 37 * gp.tileSize;

        gp.obj[233] = new OBJ_103();
        gp.obj[233].worldX = 84 * gp.tileSize;
        gp.obj[233].worldY = 37 * gp.tileSize;

        gp.obj[234] = new OBJ_103();
        gp.obj[234].worldX = 85 * gp.tileSize;
        gp.obj[234].worldY = 37 * gp.tileSize;

        gp.obj[235] = new OBJ_103();
        gp.obj[235].worldX = 86 * gp.tileSize;
        gp.obj[235].worldY = 37 * gp.tileSize;

        gp.obj[236] = new OBJ_103();
        gp.obj[236].worldX = 87 * gp.tileSize;
        gp.obj[236].worldY = 37 * gp.tileSize;

        gp.obj[237] = new OBJ_103();
        gp.obj[237].worldX = 88 * gp.tileSize;
        gp.obj[237].worldY = 37 * gp.tileSize;

        gp.obj[238] = new OBJ_103();
        gp.obj[238].worldX = 89 * gp.tileSize;
        gp.obj[238].worldY = 37 * gp.tileSize;

        gp.obj[239] = new OBJ_103();
        gp.obj[239].worldX = 90 * gp.tileSize;
        gp.obj[239].worldY = 37 * gp.tileSize;

        gp.obj[240] = new OBJ_103();
        gp.obj[240].worldX = 91 * gp.tileSize;
        gp.obj[240].worldY = 37 * gp.tileSize;

        gp.obj[241] = new OBJ_103();
        gp.obj[241].worldX = 92 * gp.tileSize;
        gp.obj[241].worldY = 37 * gp.tileSize;

        gp.obj[242] = new OBJ_103();
        gp.obj[242].worldX = 93 * gp.tileSize;
        gp.obj[242].worldY = 37 * gp.tileSize;

        gp.obj[243] = new OBJ_103();
        gp.obj[243].worldX = 94 * gp.tileSize;
        gp.obj[243].worldY = 37 * gp.tileSize;

        gp.obj[244] = new OBJ_103();
        gp.obj[244].worldX = 95 * gp.tileSize;
        gp.obj[244].worldY = 37 * gp.tileSize;

        gp.obj[245] = new OBJ_103();
        gp.obj[245].worldX = 96 * gp.tileSize;
        gp.obj[245].worldY = 37 * gp.tileSize;

        gp.obj[246] = new OBJ_103();
        gp.obj[246].worldX = 97 * gp.tileSize;
        gp.obj[246].worldY = 37 * gp.tileSize;

        gp.obj[247] = new OBJ_103();
        gp.obj[247].worldX = 98 * gp.tileSize;
        gp.obj[247].worldY = 37 * gp.tileSize;

        gp.obj[248] = new OBJ_103();
        gp.obj[248].worldX = 99 * gp.tileSize;
        gp.obj[248].worldY = 37 * gp.tileSize;

        gp.obj[249] = new OBJ_103();
        gp.obj[249].worldX = 100 * gp.tileSize;
        gp.obj[249].worldY = 37 * gp.tileSize;

        gp.obj[250] = new OBJ_103();
        gp.obj[250].worldX = 101 * gp.tileSize;
        gp.obj[250].worldY = 37 * gp.tileSize;

        gp.obj[251] = new OBJ_103();
        gp.obj[251].worldX = 102 * gp.tileSize;
        gp.obj[251].worldY = 37 * gp.tileSize;

        gp.obj[252] = new OBJ_103();
        gp.obj[252].worldX = 103 * gp.tileSize;
        gp.obj[252].worldY = 37 * gp.tileSize;

        gp.obj[253] = new OBJ_109();
        gp.obj[253].worldX = 80 * gp.tileSize;
        gp.obj[253].worldY = 38 * gp.tileSize;

        gp.obj[254] = new OBJ_109();
        gp.obj[254].worldX = 80 * gp.tileSize;
        gp.obj[254].worldY = 39 * gp.tileSize;

        gp.obj[255] = new OBJ_109();
        gp.obj[255].worldX = 80 * gp.tileSize;
        gp.obj[255].worldY = 40 * gp.tileSize;

        gp.obj[256] = new OBJ_109();
        gp.obj[256].worldX = 80 * gp.tileSize;
        gp.obj[256].worldY = 41 * gp.tileSize;

        gp.obj[257] = new OBJ_109();
        gp.obj[257].worldX = 80 * gp.tileSize;
        gp.obj[257].worldY = 42 * gp.tileSize;

        gp.obj[258] = new OBJ_109();
        gp.obj[258].worldX = 80 * gp.tileSize;
        gp.obj[258].worldY = 43 * gp.tileSize;

        gp.obj[259] = new OBJ_107();
        gp.obj[259].worldX = 80 * gp.tileSize;
        gp.obj[259].worldY = 44 * gp.tileSize;

        gp.obj[260] = new OBJ_105();
        gp.obj[260].worldX = 81 * gp.tileSize;
        gp.obj[260].worldY = 44 * gp.tileSize;

        gp.obj[261] = new OBJ_112();
        gp.obj[261].worldX = 82 * gp.tileSize;
        gp.obj[261].worldY = 44 * gp.tileSize;

        gp.obj[262] = new OBJ_109();
        gp.obj[262].worldX = 82 * gp.tileSize;
        gp.obj[262].worldY = 45 * gp.tileSize;

        gp.obj[263] = new OBJ_109();
        gp.obj[263].worldX = 82 * gp.tileSize;
        gp.obj[263].worldY = 46 * gp.tileSize;

        gp.obj[264] = new OBJ_109();
        gp.obj[264].worldX = 82 * gp.tileSize;
        gp.obj[264].worldY = 47 * gp.tileSize;

        gp.obj[265] = new OBJ_109();
        gp.obj[265].worldX = 82 * gp.tileSize;
        gp.obj[265].worldY = 48 * gp.tileSize;

        gp.obj[266] = new OBJ_109();
        gp.obj[266].worldX = 82 * gp.tileSize;
        gp.obj[266].worldY = 49 * gp.tileSize;

        gp.obj[267] = new OBJ_109();
        gp.obj[267].worldX = 82 * gp.tileSize;
        gp.obj[267].worldY = 50 * gp.tileSize;

        gp.obj[268] = new OBJ_109();
        gp.obj[268].worldX = 82 * gp.tileSize;
        gp.obj[268].worldY = 51 * gp.tileSize;

        gp.obj[269] = new OBJ_109();
        gp.obj[269].worldX = 82 * gp.tileSize;
        gp.obj[269].worldY = 52 * gp.tileSize;

        gp.obj[270] = new OBJ_109();
        gp.obj[270].worldX = 82 * gp.tileSize;
        gp.obj[270].worldY = 53 * gp.tileSize;

        gp.obj[271] = new OBJ_109();
        gp.obj[271].worldX = 82 * gp.tileSize;
        gp.obj[271].worldY = 54 * gp.tileSize;

        gp.obj[272] = new OBJ_109();
        gp.obj[272].worldX = 82 * gp.tileSize;
        gp.obj[272].worldY = 55 * gp.tileSize;

        gp.obj[273] = new OBJ_109();
        gp.obj[273].worldX = 82 * gp.tileSize;
        gp.obj[273].worldY = 56 * gp.tileSize;

        gp.obj[274] = new OBJ_109();
        gp.obj[274].worldX = 82 * gp.tileSize;
        gp.obj[274].worldY = 57 * gp.tileSize;

        gp.obj[275] = new OBJ_109();
        gp.obj[275].worldX = 82 * gp.tileSize;
        gp.obj[275].worldY = 58 * gp.tileSize;

        gp.obj[276] = new OBJ_107();
        gp.obj[276].worldX = 82 * gp.tileSize;
        gp.obj[276].worldY = 59 * gp.tileSize;

        gp.obj[277] = new OBJ_105();
        gp.obj[277].worldX = 83 * gp.tileSize;
        gp.obj[277].worldY = 59 * gp.tileSize;

        gp.obj[278] = new OBJ_105();
        gp.obj[278].worldX = 84 * gp.tileSize;
        gp.obj[278].worldY = 59 * gp.tileSize;

        gp.obj[279] = new OBJ_105();
        gp.obj[279].worldX = 85 * gp.tileSize;
        gp.obj[279].worldY = 59 * gp.tileSize;

        gp.obj[280] = new OBJ_105();
        gp.obj[280].worldX = 86 * gp.tileSize;
        gp.obj[280].worldY = 59 * gp.tileSize;

        gp.obj[281] = new OBJ_105();
        gp.obj[281].worldX = 87 * gp.tileSize;
        gp.obj[281].worldY = 59 * gp.tileSize;

        gp.obj[282] = new OBJ_105();
        gp.obj[282].worldX = 88 * gp.tileSize;
        gp.obj[282].worldY = 59 * gp.tileSize;

        gp.obj[283] = new OBJ_105();
        gp.obj[283].worldX = 89 * gp.tileSize;
        gp.obj[283].worldY = 59 * gp.tileSize;

        gp.obj[284] = new OBJ_105();
        gp.obj[284].worldX = 90 * gp.tileSize;
        gp.obj[284].worldY = 59 * gp.tileSize;

        gp.obj[285] = new OBJ_105();
        gp.obj[285].worldX = 91 * gp.tileSize;
        gp.obj[285].worldY = 59 * gp.tileSize;

        gp.obj[286] = new OBJ_105();
        gp.obj[286].worldX = 92 * gp.tileSize;
        gp.obj[286].worldY = 59 * gp.tileSize;

        gp.obj[287] = new OBJ_105();
        gp.obj[287].worldX = 93 * gp.tileSize;
        gp.obj[287].worldY = 59 * gp.tileSize;

        gp.obj[288] = new OBJ_105();
        gp.obj[288].worldX = 94 * gp.tileSize;
        gp.obj[288].worldY = 59 * gp.tileSize;

        gp.obj[289] = new OBJ_105();
        gp.obj[289].worldX = 95 * gp.tileSize;
        gp.obj[289].worldY = 59 * gp.tileSize;

        gp.obj[300] = new OBJ_106();
        gp.obj[300].worldX = 96 * gp.tileSize;
        gp.obj[300].worldY = 59 * gp.tileSize;

        gp.obj[301] = new OBJ_113();
        gp.obj[301].worldX = 96 * gp.tileSize;
        gp.obj[301].worldY = 58 * gp.tileSize;

        gp.obj[302] = new OBJ_105();
        gp.obj[302].worldX = 97 * gp.tileSize;
        gp.obj[302].worldY = 58 * gp.tileSize;

        gp.obj[303] = new OBJ_105();
        gp.obj[303].worldX = 98 * gp.tileSize;
        gp.obj[303].worldY = 58 * gp.tileSize;

        gp.obj[304] = new OBJ_105();
        gp.obj[304].worldX = 99 * gp.tileSize;
        gp.obj[304].worldY = 58 * gp.tileSize;

        gp.obj[305] = new OBJ_105();
        gp.obj[305].worldX = 100 * gp.tileSize;
        gp.obj[305].worldY = 58 * gp.tileSize;

        gp.obj[306] = new OBJ_105();
        gp.obj[306].worldX = 101 * gp.tileSize;
        gp.obj[306].worldY = 58 * gp.tileSize;

        gp.obj[307] = new OBJ_105();
        gp.obj[307].worldX = 102 * gp.tileSize;
        gp.obj[307].worldY = 58 * gp.tileSize;

        gp.obj[308] = new OBJ_105();
        gp.obj[308].worldX = 103 * gp.tileSize;
        gp.obj[308].worldY = 58 * gp.tileSize;

        gp.obj[309] = new OBJ_105();
        gp.obj[309].worldX = 104 * gp.tileSize;
        gp.obj[309].worldY = 58 * gp.tileSize;

        gp.obj[310] = new OBJ_110();
        gp.obj[310].worldX = 82 * gp.tileSize;
        gp.obj[310].worldY = 61 * gp.tileSize;

        gp.obj[311] = new OBJ_109();
        gp.obj[311].worldX = 82 * gp.tileSize;
        gp.obj[311].worldY = 62 * gp.tileSize;

        gp.obj[312] = new OBJ_109();
        gp.obj[312].worldX = 82 * gp.tileSize;
        gp.obj[312].worldY = 63 * gp.tileSize;

        gp.obj[313] = new OBJ_109();
        gp.obj[313].worldX = 82 * gp.tileSize;
        gp.obj[313].worldY = 63 * gp.tileSize;

        gp.obj[314] = new OBJ_109();
        gp.obj[314].worldX = 82 * gp.tileSize;
        gp.obj[314].worldY = 64 * gp.tileSize;

        gp.obj[315] = new OBJ_107();
        gp.obj[315].worldX = 82 * gp.tileSize;
        gp.obj[315].worldY = 65 * gp.tileSize;

        gp.obj[316] = new OBJ_103();
        gp.obj[316].worldX = 83 * gp.tileSize;
        gp.obj[316].worldY = 61 * gp.tileSize;

        gp.obj[317] = new OBJ_103();
        gp.obj[317].worldX = 84 * gp.tileSize;
        gp.obj[317].worldY = 61 * gp.tileSize;

        gp.obj[318] = new OBJ_103();
        gp.obj[318].worldX = 85 * gp.tileSize;
        gp.obj[318].worldY = 61 * gp.tileSize;

        gp.obj[319] = new OBJ_103();
        gp.obj[319].worldX = 86 * gp.tileSize;
        gp.obj[319].worldY = 61 * gp.tileSize;

        gp.obj[320] = new OBJ_103();
        gp.obj[320].worldX = 87 * gp.tileSize;
        gp.obj[320].worldY = 61 * gp.tileSize;

        gp.obj[321] = new OBJ_103();
        gp.obj[321].worldX = 88 * gp.tileSize;
        gp.obj[321].worldY = 61 * gp.tileSize;

        gp.obj[322] = new OBJ_103();
        gp.obj[322].worldX = 89 * gp.tileSize;
        gp.obj[322].worldY = 61 * gp.tileSize;

        gp.obj[323] = new OBJ_103();
        gp.obj[323].worldX = 90 * gp.tileSize;
        gp.obj[323].worldY = 61 * gp.tileSize;

        gp.obj[324] = new OBJ_103();
        gp.obj[324].worldX = 91 * gp.tileSize;
        gp.obj[324].worldY = 61 * gp.tileSize;

        gp.obj[325] = new OBJ_103();
        gp.obj[325].worldX = 92 * gp.tileSize;
        gp.obj[325].worldY = 61 * gp.tileSize;

        gp.obj[326] = new OBJ_103();
        gp.obj[326].worldX = 93 * gp.tileSize;
        gp.obj[326].worldY = 61 * gp.tileSize;

        gp.obj[327] = new OBJ_103();
        gp.obj[327].worldX = 94 * gp.tileSize;
        gp.obj[327].worldY = 61 * gp.tileSize;

        gp.obj[328] = new OBJ_103();
        gp.obj[328].worldX = 95 * gp.tileSize;
        gp.obj[328].worldY = 61 * gp.tileSize;

        gp.obj[329] = new OBJ_103();
        gp.obj[329].worldX = 96 * gp.tileSize;
        gp.obj[329].worldY = 61 * gp.tileSize;

        gp.obj[330] = new OBJ_116();
        gp.obj[330].worldX = 97 * gp.tileSize;
        gp.obj[330].worldY = 61 * gp.tileSize;

        gp.obj[331] = new OBJ_109();
        gp.obj[331].worldX = 97 * gp.tileSize;
        gp.obj[331].worldY = 60 * gp.tileSize;

        gp.obj[332] = new OBJ_110();
        gp.obj[332].worldX = 97 * gp.tileSize;
        gp.obj[332].worldY = 59 * gp.tileSize;

        gp.obj[333] = new OBJ_103();
        gp.obj[333].worldX = 98 * gp.tileSize;
        gp.obj[333].worldY = 59 * gp.tileSize;

        gp.obj[334] = new OBJ_103();
        gp.obj[334].worldX = 99 * gp.tileSize;
        gp.obj[334].worldY = 59 * gp.tileSize;

        gp.obj[335] = new OBJ_103();
        gp.obj[335].worldX = 100 * gp.tileSize;
        gp.obj[335].worldY = 59 * gp.tileSize;

        gp.obj[336] = new OBJ_103();
        gp.obj[336].worldX = 101 * gp.tileSize;
        gp.obj[336].worldY = 59 * gp.tileSize;

        gp.obj[337] = new OBJ_103();
        gp.obj[337].worldX = 102 * gp.tileSize;
        gp.obj[337].worldY = 59 * gp.tileSize;

        gp.obj[338] = new OBJ_103();
        gp.obj[338].worldX = 103 * gp.tileSize;
        gp.obj[338].worldY = 59 * gp.tileSize;

        gp.obj[339] = new OBJ_103();
        gp.obj[339].worldX = 104 * gp.tileSize;
        gp.obj[339].worldY = 59 * gp.tileSize;

        gp.obj[340] = new OBJ_105();
        gp.obj[340].worldX = 83 * gp.tileSize;
        gp.obj[340].worldY = 65 * gp.tileSize;

        gp.obj[341] = new OBJ_105();
        gp.obj[341].worldX = 84 * gp.tileSize;
        gp.obj[341].worldY = 65 * gp.tileSize;

        gp.obj[342] = new OBJ_105();
        gp.obj[342].worldX = 85 * gp.tileSize;
        gp.obj[342].worldY = 65 * gp.tileSize;

        gp.obj[343] = new OBJ_105();
        gp.obj[343].worldX = 86 * gp.tileSize;
        gp.obj[343].worldY = 65 * gp.tileSize;

        gp.obj[344] = new OBJ_105();
        gp.obj[344].worldX = 87 * gp.tileSize;
        gp.obj[344].worldY = 65 * gp.tileSize;

        gp.obj[345] = new OBJ_105();
        gp.obj[345].worldX = 88 * gp.tileSize;
        gp.obj[345].worldY = 65 * gp.tileSize;

        gp.obj[346] = new OBJ_105();
        gp.obj[346].worldX = 89 * gp.tileSize;
        gp.obj[346].worldY = 65 * gp.tileSize;

        gp.obj[347] = new OBJ_105();
        gp.obj[347].worldX = 90 * gp.tileSize;
        gp.obj[347].worldY = 65 * gp.tileSize;

        gp.obj[348] = new OBJ_105();
        gp.obj[348].worldX = 91 * gp.tileSize;
        gp.obj[348].worldY = 65 * gp.tileSize;

        gp.obj[349] = new OBJ_105();
        gp.obj[349].worldX = 92 * gp.tileSize;
        gp.obj[349].worldY = 65 * gp.tileSize;

        gp.obj[350] = new OBJ_105();
        gp.obj[350].worldX = 93 * gp.tileSize;
        gp.obj[350].worldY = 65 * gp.tileSize;

        gp.obj[351] = new OBJ_105();
        gp.obj[351].worldX = 94 * gp.tileSize;
        gp.obj[351].worldY = 65 * gp.tileSize;

        gp.obj[352] = new OBJ_105();
        gp.obj[352].worldX = 95 * gp.tileSize;
        gp.obj[352].worldY = 65 * gp.tileSize;

        gp.obj[353] = new OBJ_105();
        gp.obj[353].worldX = 96 * gp.tileSize;
        gp.obj[353].worldY = 65 * gp.tileSize;

        gp.obj[354] = new OBJ_105();
        gp.obj[354].worldX = 97 * gp.tileSize;
        gp.obj[354].worldY = 65 * gp.tileSize;

        gp.obj[355] = new OBJ_105();
        gp.obj[355].worldX = 98 * gp.tileSize;
        gp.obj[355].worldY = 65 * gp.tileSize;

        gp.obj[356] = new OBJ_105();
        gp.obj[356].worldX = 99 * gp.tileSize;
        gp.obj[356].worldY = 65 * gp.tileSize;

        gp.obj[357] = new OBJ_105();
        gp.obj[357].worldX = 100 * gp.tileSize;
        gp.obj[357].worldY = 65 * gp.tileSize;

        gp.obj[358] = new OBJ_105();
        gp.obj[358].worldX = 101 * gp.tileSize;
        gp.obj[358].worldY = 65 * gp.tileSize;

        gp.obj[359] = new OBJ_105();
        gp.obj[359].worldX = 102 * gp.tileSize;
        gp.obj[359].worldY = 65 * gp.tileSize;

        gp.obj[360] = new OBJ_105();
        gp.obj[360].worldX = 103 * gp.tileSize;
        gp.obj[360].worldY = 65 * gp.tileSize;

        gp.obj[361] = new OBJ_105();
        gp.obj[361].worldX = 104 * gp.tileSize;
        gp.obj[361].worldY = 65 * gp.tileSize;

        //ดอกไม้กลุ่มบน
        //===================================
        gp.obj[362] = new OBJ_98();
        gp.obj[362].worldX = 66 * gp.tileSize;
        gp.obj[362].worldY = 38 * gp.tileSize;

        gp.obj[363] = new OBJ_98();
        gp.obj[363].worldX = 67 * gp.tileSize;
        gp.obj[363].worldY = 38 * gp.tileSize;

        gp.obj[364] = new OBJ_98();
        gp.obj[364].worldX = 68 * gp.tileSize;
        gp.obj[364].worldY = 38 * gp.tileSize;

        gp.obj[365] = new OBJ_98();
        gp.obj[365].worldX = 69 * gp.tileSize;
        gp.obj[365].worldY = 38 * gp.tileSize;

        gp.obj[366] = new OBJ_98();
        gp.obj[366].worldX = 70 * gp.tileSize;
        gp.obj[366].worldY = 38 * gp.tileSize;

        gp.obj[367] = new OBJ_98();
        gp.obj[367].worldX = 71 * gp.tileSize;
        gp.obj[367].worldY = 38 * gp.tileSize;

        gp.obj[368] = new OBJ_98();
        gp.obj[368].worldX = 72 * gp.tileSize;
        gp.obj[368].worldY = 38 * gp.tileSize;

        gp.obj[369] = new OBJ_98();
        gp.obj[369].worldX = 73 * gp.tileSize;
        gp.obj[369].worldY = 38 * gp.tileSize;

        gp.obj[370] = new OBJ_98();
        gp.obj[370].worldX = 74 * gp.tileSize;
        gp.obj[370].worldY = 38 * gp.tileSize;

        gp.obj[371] = new OBJ_98();
        gp.obj[371].worldX = 75 * gp.tileSize;
        gp.obj[371].worldY = 38 * gp.tileSize;

        gp.obj[372] = new OBJ_98();
        gp.obj[372].worldX = 76 * gp.tileSize;
        gp.obj[372].worldY = 38 * gp.tileSize;

        gp.obj[373] = new OBJ_98();
        gp.obj[373].worldX = 82 * gp.tileSize;
        gp.obj[373].worldY = 38 * gp.tileSize;

        gp.obj[374] = new OBJ_98();
        gp.obj[374].worldX = 96 * gp.tileSize;
        gp.obj[374].worldY = 38 * gp.tileSize;

        gp.obj[375] = new OBJ_98();
        gp.obj[375].worldX = 93 * gp.tileSize;
        gp.obj[375].worldY = 40 * gp.tileSize;

        gp.obj[376] = new OBJ_98();
        gp.obj[376].worldX = 94 * gp.tileSize;
        gp.obj[376].worldY = 40 * gp.tileSize;

        gp.obj[377] = new OBJ_98();
        gp.obj[377].worldX = 95 * gp.tileSize;
        gp.obj[377].worldY = 40 * gp.tileSize;

        gp.obj[378] = new OBJ_98();
        gp.obj[378].worldX = 93 * gp.tileSize;
        gp.obj[378].worldY = 41 * gp.tileSize;

        gp.obj[379] = new OBJ_98();
        gp.obj[379].worldX = 94 * gp.tileSize;
        gp.obj[379].worldY = 41 * gp.tileSize;

        gp.obj[380] = new OBJ_98();
        gp.obj[380].worldX = 75 * gp.tileSize;
        gp.obj[380].worldY = 53 * gp.tileSize;

        gp.obj[381] = new OBJ_98();
        gp.obj[381].worldX = 83 * gp.tileSize;
        gp.obj[381].worldY = 54 * gp.tileSize;

        gp.obj[385] = new OBJ_45();
        gp.obj[385].worldX = 20 * gp.tileSize;
        gp.obj[385].worldY = 38 * gp.tileSize;

        gp.obj[386] = new OBJ_42();
        gp.obj[386].worldX = 19 * gp.tileSize;
        gp.obj[386].worldY = 37 * gp.tileSize;

        gp.obj[387] = new OBJ_43();
        gp.obj[387].worldX = 19 * gp.tileSize;
        gp.obj[387].worldY = 38 * gp.tileSize;

        gp.obj[388] = null;


        gp.obj[389] = null;
  

        gp.obj[390] = null;
   

        gp.obj[391] = null;


        gp.obj[392] = null;
 

        gp.obj[393] = null;


        gp.obj[394] = null;


        gp.obj[395] = null;


        gp.obj[396] = null;


        gp.obj[397] = null;


        gp.obj[398] = null;
 

        gp.obj[399] = null;


        gp.obj[400] = new OBJ_46();
        gp.obj[400].worldX = 21 * gp.tileSize;
        gp.obj[400].worldY = 38 * gp.tileSize;

        gp.obj[401] = new OBJ_44();
        gp.obj[401].worldX = 21 * gp.tileSize;
        gp.obj[401].worldY = 37 * gp.tileSize;


        gp.obj[402] = new OBJ_46();
        gp.obj[402].worldX = 22 * gp.tileSize;
        gp.obj[402].worldY = 38 * gp.tileSize;

        gp.obj[403] = new OBJ_44();
        gp.obj[403].worldX = 22 * gp.tileSize;
        gp.obj[403].worldY = 37 * gp.tileSize;

        gp.obj[404] = new OBJ_46();
        gp.obj[404].worldX = 23 * gp.tileSize;
        gp.obj[404].worldY = 38 * gp.tileSize;

        gp.obj[405] = new OBJ_44();
        gp.obj[405].worldX = 23 * gp.tileSize;
        gp.obj[405].worldY = 37 * gp.tileSize;

        gp.obj[406] = new OBJ_46();
        gp.obj[406].worldX = 24 * gp.tileSize;
        gp.obj[406].worldY = 38 * gp.tileSize;

        gp.obj[407] = new OBJ_44();
        gp.obj[407].worldX = 24 * gp.tileSize;
        gp.obj[407].worldY = 37 * gp.tileSize;

        gp.obj[408] = new OBJ_46();
        gp.obj[408].worldX = 25 * gp.tileSize;
        gp.obj[408].worldY = 38 * gp.tileSize;

        gp.obj[409] = new OBJ_44();
        gp.obj[409].worldX = 25 * gp.tileSize;
        gp.obj[409].worldY = 37 * gp.tileSize;

        gp.obj[410] = new OBJ_46();
        gp.obj[410].worldX = 26 * gp.tileSize;
        gp.obj[410].worldY = 38 * gp.tileSize;

        gp.obj[411] = new OBJ_44();
        gp.obj[411].worldX = 26 * gp.tileSize;
        gp.obj[411].worldY = 37 * gp.tileSize;

        gp.obj[412] = new OBJ_46();
        gp.obj[412].worldX = 27 * gp.tileSize;
        gp.obj[412].worldY = 38 * gp.tileSize;

        gp.obj[413] = new OBJ_44();
        gp.obj[413].worldX = 27 * gp.tileSize;
        gp.obj[413].worldY = 37 * gp.tileSize;

        gp.obj[414] = new OBJ_46();
        gp.obj[414].worldX = 28 * gp.tileSize;
        gp.obj[414].worldY = 38 * gp.tileSize;

        gp.obj[415] = new OBJ_44();
        gp.obj[415].worldX = 28 * gp.tileSize;
        gp.obj[415].worldY = 37 * gp.tileSize;

        gp.obj[416] = new OBJ_46();
        gp.obj[416].worldX = 29 * gp.tileSize;
        gp.obj[416].worldY = 38 * gp.tileSize;

        gp.obj[417] = new OBJ_44();
        gp.obj[417].worldX = 29 * gp.tileSize;
        gp.obj[417].worldY = 37 * gp.tileSize;

        gp.obj[418] = new OBJ_46();
        gp.obj[418].worldX = 30 * gp.tileSize;
        gp.obj[418].worldY = 38 * gp.tileSize;

        gp.obj[419] = new OBJ_44();
        gp.obj[419].worldX = 30 * gp.tileSize;
        gp.obj[419].worldY = 37 * gp.tileSize;

        gp.obj[424] = new OBJ_45();
        gp.obj[424].worldX = 31 * gp.tileSize;
        gp.obj[424].worldY = 38 * gp.tileSize;
//		gp.obj[428].worldY = 39 * gp.tileSize;

        gp.obj[429] = new OBJ_46();
        gp.obj[429].worldX = 32 * gp.tileSize;
        gp.obj[429].worldY = 38 * gp.tileSize;

        gp.obj[433] = new OBJ_45();
        gp.obj[433].worldX = 65 * gp.tileSize;
        gp.obj[433].worldY = 73 * gp.tileSize;

        gp.obj[434] = new OBJ_42();
        gp.obj[434].worldX = 64 * gp.tileSize;
        gp.obj[434].worldY = 72 * gp.tileSize;

        gp.obj[435] = new OBJ_43();
        gp.obj[435].worldX = 64 * gp.tileSize;
        gp.obj[435].worldY = 73 * gp.tileSize;

        gp.obj[436] = new OBJ_46();
        gp.obj[436].worldX = 66 * gp.tileSize;
        gp.obj[436].worldY = 73 * gp.tileSize;

        gp.obj[437] = new OBJ_44();
        gp.obj[437].worldX = 66 * gp.tileSize;
        gp.obj[437].worldY = 72 * gp.tileSize;

        gp.obj[438] = new OBJ_46();
        gp.obj[438].worldX = 67 * gp.tileSize;
        gp.obj[438].worldY = 73 * gp.tileSize;

        gp.obj[439] = new OBJ_44();
        gp.obj[439].worldX = 67 * gp.tileSize;
        gp.obj[439].worldY = 72 * gp.tileSize;

        gp.obj[440] = new OBJ_46();
        gp.obj[440].worldX = 68 * gp.tileSize;
        gp.obj[440].worldY = 73 * gp.tileSize;

        gp.obj[441] = new OBJ_44();
        gp.obj[441].worldX = 68 * gp.tileSize;
        gp.obj[441].worldY = 72 * gp.tileSize;

        gp.obj[442] = new OBJ_46();
        gp.obj[442].worldX = 69 * gp.tileSize;
        gp.obj[442].worldY = 73 * gp.tileSize;

        gp.obj[443] = new OBJ_44();
        gp.obj[443].worldX = 69 * gp.tileSize;
        gp.obj[443].worldY = 72 * gp.tileSize;

        gp.obj[444] = new OBJ_46();
        gp.obj[444].worldX = 70 * gp.tileSize;
        gp.obj[444].worldY = 73 * gp.tileSize;

        gp.obj[445] = new OBJ_44();
        gp.obj[445].worldX = 70 * gp.tileSize;
        gp.obj[445].worldY = 72 * gp.tileSize;

        gp.obj[450] = new OBJ_45();
        gp.obj[450].worldX = 71 * gp.tileSize;
        gp.obj[450].worldY = 73 * gp.tileSize;

        gp.obj[454] = new OBJ_46();
        gp.obj[454].worldX = 72 * gp.tileSize;
        gp.obj[454].worldY = 73 * gp.tileSize;

        gp.obj[455] = new OBJ_47();
        gp.obj[455].worldX = 72 * gp.tileSize;
        gp.obj[455].worldY = 72 * gp.tileSize;

        gp.obj[460] = new OBJ_47();
        gp.obj[460].worldX = 32 * gp.tileSize;
        gp.obj[460].worldY = 37 * gp.tileSize;

        // ท่อ 
        gp.obj[461] = new OBJ_118();
        gp.obj[461].worldX = 11 * gp.tileSize;
        gp.obj[461].worldY = 24 * gp.tileSize;

        //ต้นไม้ที่มีกระถางเหลือง
        gp.obj[462] = new OBJ_119();
        gp.obj[462].worldX = 6 * gp.tileSize;
        gp.obj[462].worldY = 7 * gp.tileSize;

        gp.obj[463] = new OBJ_120();
        gp.obj[463].worldX = 6 * gp.tileSize;
        gp.obj[463].worldY = 8 * gp.tileSize;

        gp.obj[464] = new OBJ_8();
        gp.obj[464].worldX = 7 * gp.tileSize;
        gp.obj[464].worldY = 7 * gp.tileSize;

        gp.obj[465] = new OBJ_7();
        gp.obj[465].worldX = 7 * gp.tileSize;
        gp.obj[465].worldY = 8 * gp.tileSize;

        gp.obj[466] = new OBJ_121();
        gp.obj[466].worldX = 8 * gp.tileSize;
        gp.obj[466].worldY = 7 * gp.tileSize;

        gp.obj[467] = new OBJ_122();
        gp.obj[467].worldX = 8 * gp.tileSize;
        gp.obj[467].worldY = 8 * gp.tileSize;

        // ถังข้างๆ ต้นไม้กระถางเหลือง
        gp.obj[468] = new OBJ_5();
        gp.obj[468].worldX = 9 * gp.tileSize;
        gp.obj[468].worldY = 8 * gp.tileSize;

        // ที่วาง ห้ามไป ของจราจร
        gp.obj[469] = new OBJ_35();
        gp.obj[469].worldX = 34 * gp.tileSize;
        gp.obj[469].worldY = 48 * gp.tileSize;

        gp.obj[470] = new OBJ_37();
        gp.obj[470].worldX = 34 * gp.tileSize;
        gp.obj[470].worldY = 49 * gp.tileSize;

        gp.obj[471] = new OBJ_36();
        gp.obj[471].worldX = 35 * gp.tileSize;
        gp.obj[471].worldY = 48 * gp.tileSize;

        gp.obj[472] = new OBJ_38();
        gp.obj[472].worldX = 35 * gp.tileSize;
        gp.obj[472].worldY = 49 * gp.tileSize;

        //รั้วขาวยาวๆๆ
        gp.obj[473] = new OBJ_89();
        gp.obj[473].worldX = 37 * gp.tileSize;
        gp.obj[473].worldY = 48 * gp.tileSize;

        gp.obj[474] = new OBJ_123();
        gp.obj[474].worldX = 38 * gp.tileSize;
        gp.obj[474].worldY = 48 * gp.tileSize;

        gp.obj[475] = new OBJ_123();
        gp.obj[475].worldX = 39 * gp.tileSize;
        gp.obj[475].worldY = 48 * gp.tileSize;

        gp.obj[476] = new OBJ_123();
        gp.obj[476].worldX = 40 * gp.tileSize;
        gp.obj[476].worldY = 48 * gp.tileSize;

        gp.obj[477] = new OBJ_123();
        gp.obj[477].worldX = 41 * gp.tileSize;
        gp.obj[477].worldY = 48 * gp.tileSize;

        gp.obj[478] = new OBJ_123();
        gp.obj[478].worldX = 42 * gp.tileSize;
        gp.obj[478].worldY = 48 * gp.tileSize;

        gp.obj[479] = new OBJ_123();
        gp.obj[479].worldX = 43 * gp.tileSize;
        gp.obj[479].worldY = 48 * gp.tileSize;

        gp.obj[480] = new OBJ_123();
        gp.obj[480].worldX = 44 * gp.tileSize;
        gp.obj[480].worldY = 48 * gp.tileSize;

        gp.obj[481] = new OBJ_123();
        gp.obj[481].worldX = 45 * gp.tileSize;
        gp.obj[481].worldY = 48 * gp.tileSize;

        gp.obj[482] = new OBJ_123();
        gp.obj[482].worldX = 46 * gp.tileSize;
        gp.obj[482].worldY = 48 * gp.tileSize;

        gp.obj[483] = new OBJ_123();
        gp.obj[483].worldX = 47 * gp.tileSize;
        gp.obj[483].worldY = 48 * gp.tileSize;

        gp.obj[484] = new OBJ_123();
        gp.obj[484].worldX = 48 * gp.tileSize;
        gp.obj[484].worldY = 48 * gp.tileSize;

        gp.obj[485] = new OBJ_123();
        gp.obj[485].worldX = 49 * gp.tileSize;
        gp.obj[485].worldY = 48 * gp.tileSize;

        gp.obj[486] = new OBJ_123();
        gp.obj[486].worldX = 50 * gp.tileSize;
        gp.obj[486].worldY = 48 * gp.tileSize;

        gp.obj[487] = new OBJ_123();
        gp.obj[487].worldX = 51 * gp.tileSize;
        gp.obj[487].worldY = 48 * gp.tileSize;

        gp.obj[488] = new OBJ_123();
        gp.obj[488].worldX = 52 * gp.tileSize;
        gp.obj[488].worldY = 48 * gp.tileSize;

        gp.obj[489] = new OBJ_123();
        gp.obj[489].worldX = 53 * gp.tileSize;
        gp.obj[489].worldY = 48 * gp.tileSize;

        gp.obj[490] = new OBJ_123();
        gp.obj[490].worldX = 54 * gp.tileSize;
        gp.obj[490].worldY = 48 * gp.tileSize;

        gp.obj[491] = new OBJ_123();
        gp.obj[491].worldX = 55 * gp.tileSize;
        gp.obj[491].worldY = 48 * gp.tileSize;

        gp.obj[492] = new OBJ_123();
        gp.obj[492].worldX = 56 * gp.tileSize;
        gp.obj[492].worldY = 48 * gp.tileSize;

        gp.obj[493] = new OBJ_123();
        gp.obj[493].worldX = 57 * gp.tileSize;
        gp.obj[493].worldY = 48 * gp.tileSize;

        gp.obj[494] = new OBJ_123();
        gp.obj[494].worldX = 58 * gp.tileSize;
        gp.obj[494].worldY = 48 * gp.tileSize;

        gp.obj[495] = new OBJ_123();
        gp.obj[495].worldX = 59 * gp.tileSize;
        gp.obj[495].worldY = 48 * gp.tileSize;

        gp.obj[496] = new OBJ_123();
        gp.obj[496].worldX = 60 * gp.tileSize;
        gp.obj[496].worldY = 48 * gp.tileSize;

        gp.obj[497] = new OBJ_123();
        gp.obj[497].worldX = 61 * gp.tileSize;
        gp.obj[497].worldY = 48 * gp.tileSize;

        gp.obj[498] = new OBJ_123();
        gp.obj[498].worldX = 62 * gp.tileSize;
        gp.obj[498].worldY = 48 * gp.tileSize;

        gp.obj[499] = new OBJ_123();
        gp.obj[499].worldX = 63 * gp.tileSize;
        gp.obj[499].worldY = 48 * gp.tileSize;

        gp.obj[500] = new OBJ_123();
        gp.obj[500].worldX = 64 * gp.tileSize;
        gp.obj[500].worldY = 48 * gp.tileSize;

        gp.obj[501] = new OBJ_123();
        gp.obj[501].worldX = 65 * gp.tileSize;
        gp.obj[501].worldY = 48 * gp.tileSize;

        gp.obj[502] = new OBJ_123();
        gp.obj[502].worldX = 66 * gp.tileSize;
        gp.obj[502].worldY = 48 * gp.tileSize;

        gp.obj[503] = new OBJ_123();
        gp.obj[503].worldX = 67 * gp.tileSize;
        gp.obj[503].worldY = 48 * gp.tileSize;

        gp.obj[504] = new OBJ_123();
        gp.obj[504].worldX = 68 * gp.tileSize;
        gp.obj[504].worldY = 48 * gp.tileSize;

        gp.obj[505] = new OBJ_123();
        gp.obj[505].worldX = 69 * gp.tileSize;
        gp.obj[505].worldY = 48 * gp.tileSize;

        gp.obj[506] = new OBJ_123();
        gp.obj[506].worldX = 70 * gp.tileSize;
        gp.obj[506].worldY = 48 * gp.tileSize;

        gp.obj[507] = new OBJ_123();
        gp.obj[507].worldX = 71 * gp.tileSize;
        gp.obj[507].worldY = 48 * gp.tileSize;

        gp.obj[508] = new OBJ_123();
        gp.obj[508].worldX = 72 * gp.tileSize;
        gp.obj[508].worldY = 48 * gp.tileSize;

        gp.obj[509] = new OBJ_90();
        gp.obj[509].worldX = 73 * gp.tileSize;
        gp.obj[509].worldY = 48 * gp.tileSize;

        gp.obj[510] = new OBJ_88();
        gp.obj[510].worldX = 73 * gp.tileSize;
        gp.obj[510].worldY = 49 * gp.tileSize;

        gp.obj[511] = new OBJ_88();
        gp.obj[511].worldX = 73 * gp.tileSize;
        gp.obj[511].worldY = 50 * gp.tileSize;

        gp.obj[512] = new OBJ_88();
        gp.obj[512].worldX = 73 * gp.tileSize;
        gp.obj[512].worldY = 51 * gp.tileSize;

        gp.obj[513] = new OBJ_88();
        gp.obj[513].worldX = 73 * gp.tileSize;
        gp.obj[513].worldY = 52 * gp.tileSize;

        gp.obj[514] = new OBJ_88();
        gp.obj[514].worldX = 73 * gp.tileSize;
        gp.obj[514].worldY = 53 * gp.tileSize;

        gp.obj[515] = new OBJ_88();
        gp.obj[515].worldX = 73 * gp.tileSize;
        gp.obj[515].worldY = 54 * gp.tileSize;

        gp.obj[516] = new OBJ_88();
        gp.obj[516].worldX = 73 * gp.tileSize;
        gp.obj[516].worldY = 55 * gp.tileSize;

        gp.obj[517] = new OBJ_88();
        gp.obj[517].worldX = 73 * gp.tileSize;
        gp.obj[517].worldY = 56 * gp.tileSize;

        gp.obj[518] = new OBJ_88();
        gp.obj[518].worldX = 73 * gp.tileSize;
        gp.obj[518].worldY = 57 * gp.tileSize;

        gp.obj[519] = new OBJ_88();
        gp.obj[519].worldX = 73 * gp.tileSize;
        gp.obj[519].worldY = 58 * gp.tileSize;

        gp.obj[520] = new OBJ_88();
        gp.obj[520].worldX = 73 * gp.tileSize;
        gp.obj[520].worldY = 59 * gp.tileSize;

        gp.obj[521] = new OBJ_88();
        gp.obj[521].worldX = 73 * gp.tileSize;
        gp.obj[521].worldY = 60 * gp.tileSize;

        gp.obj[522] = new OBJ_88();
        gp.obj[522].worldX = 73 * gp.tileSize;
        gp.obj[522].worldY = 61 * gp.tileSize;

        gp.obj[523] = new OBJ_88();
        gp.obj[523].worldX = 73 * gp.tileSize;
        gp.obj[523].worldY = 62 * gp.tileSize;

        gp.obj[524] = new OBJ_88();
        gp.obj[524].worldX = 73 * gp.tileSize;
        gp.obj[524].worldY = 63 * gp.tileSize;

        gp.obj[525] = new OBJ_88();
        gp.obj[525].worldX = 73 * gp.tileSize;
        gp.obj[525].worldY = 64 * gp.tileSize;

        gp.obj[526] = new OBJ_88();
        gp.obj[526].worldX = 73 * gp.tileSize;
        gp.obj[526].worldY = 65 * gp.tileSize;

        gp.obj[527] = new OBJ_88();
        gp.obj[527].worldX = 73 * gp.tileSize;
        gp.obj[527].worldY = 66 * gp.tileSize;

        gp.obj[528] = new OBJ_88();
        gp.obj[528].worldX = 73 * gp.tileSize;
        gp.obj[528].worldY = 67 * gp.tileSize;

        gp.obj[529] = new OBJ_88();
        gp.obj[529].worldX = 73 * gp.tileSize;
        gp.obj[529].worldY = 68 * gp.tileSize;

        gp.obj[530] = new OBJ_88();
        gp.obj[530].worldX = 73 * gp.tileSize;
        gp.obj[530].worldY = 69 * gp.tileSize;

        gp.obj[531] = new OBJ_88();
        gp.obj[531].worldX = 73 * gp.tileSize;
        gp.obj[531].worldY = 70 * gp.tileSize;

        gp.obj[532] = new OBJ_88();
        gp.obj[532].worldX = 73 * gp.tileSize;
        gp.obj[532].worldY = 71 * gp.tileSize;

        gp.obj[533] = new OBJ_88();
        gp.obj[533].worldX = 73 * gp.tileSize;
        gp.obj[533].worldY = 72 * gp.tileSize;

        gp.obj[425] = new OBJ_88();
        gp.obj[425].worldX = 73 * gp.tileSize;
        gp.obj[425].worldY = 73 * gp.tileSize;

        gp.obj[426] = new OBJ_88();
        gp.obj[426].worldX = 73 * gp.tileSize;
        gp.obj[426].worldY = 74 * gp.tileSize;

        gp.obj[534] = new OBJ_88();
        gp.obj[534].worldX = 73 * gp.tileSize;
        gp.obj[534].worldY = 75 * gp.tileSize;

        gp.obj[535] = new OBJ_88();
        gp.obj[535].worldX = 73 * gp.tileSize;
        gp.obj[535].worldY = 76 * gp.tileSize;

        gp.obj[536] = new OBJ_88();
        gp.obj[536].worldX = 73 * gp.tileSize;
        gp.obj[536].worldY = 77 * gp.tileSize;

        gp.obj[537] = new OBJ_88();
        gp.obj[537].worldX = 73 * gp.tileSize;
        gp.obj[537].worldY = 78 * gp.tileSize;

        gp.obj[538] = new OBJ_88();
        gp.obj[538].worldX = 73 * gp.tileSize;
        gp.obj[538].worldY = 79 * gp.tileSize;

        gp.obj[539] = new OBJ_88();
        gp.obj[539].worldX = 73 * gp.tileSize;
        gp.obj[539].worldY = 80 * gp.tileSize;

        gp.obj[540] = new OBJ_88();
        gp.obj[540].worldX = 73 * gp.tileSize;
        gp.obj[540].worldY = 81 * gp.tileSize;

        gp.obj[541] = new OBJ_88();
        gp.obj[541].worldX = 73 * gp.tileSize;
        gp.obj[541].worldY = 82 * gp.tileSize;

        // รถต่างๆ ซ้ายสุด
        gp.obj[542] = new OBJ_52();
        gp.obj[542].worldX = 78 * gp.tileSize;
        gp.obj[542].worldY = 68 * gp.tileSize;

        gp.obj[543] = new OBJ_53();
        gp.obj[543].worldX = 78 * gp.tileSize;
        gp.obj[543].worldY = 69 * gp.tileSize;

        gp.obj[544] = new OBJ_48();
        gp.obj[544].worldX = 78 * gp.tileSize;
        gp.obj[544].worldY = 70 * gp.tileSize;

        gp.obj[545] = new OBJ_49();
        gp.obj[545].worldX = 78 * gp.tileSize;
        gp.obj[545].worldY = 71 * gp.tileSize;

        gp.obj[546] = new OBJ_50();
        gp.obj[546].worldX = 78 * gp.tileSize;
        gp.obj[546].worldY = 73 * gp.tileSize;

        gp.obj[547] = new OBJ_51();
        gp.obj[547].worldX = 78 * gp.tileSize;
        gp.obj[547].worldY = 74 * gp.tileSize;

        gp.obj[548] = new OBJ_52();
        gp.obj[548].worldX = 78 * gp.tileSize;
        gp.obj[548].worldY = 76 * gp.tileSize;

        gp.obj[549] = new OBJ_53();
        gp.obj[549].worldX = 78 * gp.tileSize;
        gp.obj[549].worldY = 77 * gp.tileSize;

        gp.obj[550] = new OBJ_54();
        gp.obj[550].worldX = 78 * gp.tileSize;
        gp.obj[550].worldY = 78 * gp.tileSize;

        gp.obj[551] = new OBJ_55();
        gp.obj[551].worldX = 78 * gp.tileSize;
        gp.obj[551].worldY = 79 * gp.tileSize;

        //รถต่างๆ กลาง
        gp.obj[552] = new OBJ_62();
        gp.obj[552].worldX = 83 * gp.tileSize;
        gp.obj[552].worldY = 70 * gp.tileSize;

        gp.obj[553] = new OBJ_63();
        gp.obj[553].worldX = 83 * gp.tileSize;
        gp.obj[553].worldY = 71 * gp.tileSize;

        gp.obj[554] = new OBJ_60();
        gp.obj[554].worldX = 83 * gp.tileSize;
        gp.obj[554].worldY = 72 * gp.tileSize;

        gp.obj[555] = new OBJ_61();
        gp.obj[555].worldX = 83 * gp.tileSize;
        gp.obj[555].worldY = 73 * gp.tileSize;

        gp.obj[556] = new OBJ_64();
        gp.obj[556].worldX = 83 * gp.tileSize;
        gp.obj[556].worldY = 74 * gp.tileSize;

        gp.obj[557] = new OBJ_65();
        gp.obj[557].worldX = 83 * gp.tileSize;
        gp.obj[557].worldY = 75 * gp.tileSize;

        gp.obj[558] = new OBJ_62();
        gp.obj[558].worldX = 83 * gp.tileSize;
        gp.obj[558].worldY = 76 * gp.tileSize;

        gp.obj[559] = new OBJ_63();
        gp.obj[559].worldX = 83 * gp.tileSize;
        gp.obj[559].worldY = 77 * gp.tileSize;

        gp.obj[560] = new OBJ_52();
        gp.obj[560].worldX = 86 * gp.tileSize;
        gp.obj[560].worldY = 70 * gp.tileSize;

        gp.obj[561] = new OBJ_53();
        gp.obj[561].worldX = 86 * gp.tileSize;
        gp.obj[561].worldY = 71 * gp.tileSize;

        gp.obj[562] = new OBJ_54();
        gp.obj[562].worldX = 86 * gp.tileSize;
        gp.obj[562].worldY = 73 * gp.tileSize;

        gp.obj[563] = new OBJ_55();
        gp.obj[563].worldX = 86 * gp.tileSize;
        gp.obj[563].worldY = 74 * gp.tileSize;

        gp.obj[564] = new OBJ_48();
        gp.obj[564].worldX = 86 * gp.tileSize;
        gp.obj[564].worldY = 77 * gp.tileSize;

        gp.obj[565] = new OBJ_49();
        gp.obj[565].worldX = 86 * gp.tileSize;
        gp.obj[565].worldY = 78 * gp.tileSize;

        // รถคันเต้มๆ
        gp.obj[566] = new OBJ_60();
        gp.obj[566].worldX = 74 * gp.tileSize;
        gp.obj[566].worldY = 66 * gp.tileSize;

        gp.obj[567] = new OBJ_61();
        gp.obj[567].worldX = 74 * gp.tileSize;
        gp.obj[567].worldY = 67 * gp.tileSize;

        gp.obj[568] = new OBJ_124();
        gp.obj[568].worldX = 75 * gp.tileSize;
        gp.obj[568].worldY = 66 * gp.tileSize;

        gp.obj[569] = new OBJ_125();
        gp.obj[569].worldX = 75 * gp.tileSize;
        gp.obj[569].worldY = 67 * gp.tileSize;

        gp.obj[570] = new OBJ_48();
        gp.obj[570].worldX = 76 * gp.tileSize;
        gp.obj[570].worldY = 66 * gp.tileSize;

        gp.obj[571] = new OBJ_49();
        gp.obj[571].worldX = 76 * gp.tileSize;
        gp.obj[571].worldY = 67 * gp.tileSize;

        gp.obj[572] = new OBJ_56();
        gp.obj[572].worldX = 91 * gp.tileSize;
        gp.obj[572].worldY = 71 * gp.tileSize;

        gp.obj[573] = new OBJ_57();
        gp.obj[573].worldX = 91 * gp.tileSize;
        gp.obj[573].worldY = 72 * gp.tileSize;

        gp.obj[574] = new OBJ_58();
        gp.obj[574].worldX = 91 * gp.tileSize;
        gp.obj[574].worldY = 75 * gp.tileSize;

        gp.obj[575] = new OBJ_59();
        gp.obj[575].worldX = 91 * gp.tileSize;
        gp.obj[575].worldY = 76 * gp.tileSize;

        //ต้นไม้ 3 ต้น กระถางเหลือง
        gp.obj[576] = new OBJ_119();
        gp.obj[576].worldX = 90 * gp.tileSize;
        gp.obj[576].worldY = 68 * gp.tileSize;

        gp.obj[577] = new OBJ_120();
        gp.obj[577].worldX = 90 * gp.tileSize;
        gp.obj[577].worldY = 69 * gp.tileSize;

        gp.obj[578] = new OBJ_8();
        gp.obj[578].worldX = 91 * gp.tileSize;
        gp.obj[578].worldY = 68 * gp.tileSize;

        gp.obj[579] = new OBJ_7();
        gp.obj[579].worldX = 91 * gp.tileSize;
        gp.obj[579].worldY = 69 * gp.tileSize;

        gp.obj[580] = new OBJ_121();
        gp.obj[580].worldX = 92 * gp.tileSize;
        gp.obj[580].worldY = 68 * gp.tileSize;

        gp.obj[581] = new OBJ_122();
        gp.obj[581].worldX = 92 * gp.tileSize;
        gp.obj[581].worldY = 69 * gp.tileSize;

        gp.obj[582] = new OBJ_119();
        gp.obj[582].worldX = 90 * gp.tileSize;
        gp.obj[582].worldY = 78 * gp.tileSize;

        gp.obj[583] = new OBJ_120();
        gp.obj[583].worldX = 90 * gp.tileSize;
        gp.obj[583].worldY = 79 * gp.tileSize;

        gp.obj[584] = new OBJ_8();
        gp.obj[584].worldX = 91 * gp.tileSize;
        gp.obj[584].worldY = 78 * gp.tileSize;

        gp.obj[585] = new OBJ_7();
        gp.obj[585].worldX = 91 * gp.tileSize;
        gp.obj[585].worldY = 79 * gp.tileSize;

        gp.obj[586] = new OBJ_121();
        gp.obj[586].worldX = 92 * gp.tileSize;
        gp.obj[586].worldY = 78 * gp.tileSize;

        gp.obj[587] = new OBJ_122();
        gp.obj[587].worldX = 92 * gp.tileSize;
        gp.obj[587].worldY = 79 * gp.tileSize;

        //เก้าอี้ฟ้า
        gp.obj[588] = new OBJ_66();
        gp.obj[588].worldX = 72 * gp.tileSize;
        gp.obj[588].worldY = 90 * gp.tileSize;

        gp.obj[589] = new OBJ_67();
        gp.obj[589].worldX = 72 * gp.tileSize;
        gp.obj[589].worldY = 91 * gp.tileSize;

        gp.obj[590] = new OBJ_66();
        gp.obj[590].worldX = 72 * gp.tileSize;
        gp.obj[590].worldY = 93 * gp.tileSize;

        gp.obj[591] = new OBJ_67();
        gp.obj[591].worldX = 72 * gp.tileSize;
        gp.obj[591].worldY = 94 * gp.tileSize;

        //รั้วขาวหน้าตึกไอที
        gp.obj[592] = new OBJ_88();
        gp.obj[592].worldX = 73 * gp.tileSize;
        gp.obj[592].worldY = 87 * gp.tileSize;

        gp.obj[593] = new OBJ_88();
        gp.obj[593].worldX = 73 * gp.tileSize;
        gp.obj[593].worldY = 88 * gp.tileSize;

        gp.obj[594] = new OBJ_88();
        gp.obj[594].worldX = 73 * gp.tileSize;
        gp.obj[594].worldY = 89 * gp.tileSize;

        gp.obj[595] = new OBJ_88();
        gp.obj[595].worldX = 73 * gp.tileSize;
        gp.obj[595].worldY = 90 * gp.tileSize;

        gp.obj[596] = new OBJ_88();
        gp.obj[596].worldX = 73 * gp.tileSize;
        gp.obj[596].worldY = 91 * gp.tileSize;

        gp.obj[597] = new OBJ_88();
        gp.obj[597].worldX = 73 * gp.tileSize;
        gp.obj[597].worldY = 92 * gp.tileSize;

        gp.obj[598] = new OBJ_88();
        gp.obj[598].worldX = 73 * gp.tileSize;
        gp.obj[598].worldY = 93 * gp.tileSize;

        gp.obj[599] = new OBJ_88();
        gp.obj[599].worldX = 73 * gp.tileSize;
        gp.obj[599].worldY = 94 * gp.tileSize;

        gp.obj[600] = new OBJ_88();
        gp.obj[600].worldX = 73 * gp.tileSize;
        gp.obj[600].worldY = 95 * gp.tileSize;

        gp.obj[601] = new OBJ_88();
        gp.obj[601].worldX = 73 * gp.tileSize;
        gp.obj[601].worldY = 96 * gp.tileSize;

        gp.obj[602] = new OBJ_88();
        gp.obj[602].worldX = 73 * gp.tileSize;
        gp.obj[602].worldY = 97 * gp.tileSize;

        gp.obj[603] = new OBJ_88();
        gp.obj[603].worldX = 73 * gp.tileSize;
        gp.obj[603].worldY = 98 * gp.tileSize;

        gp.obj[604] = new OBJ_88();
        gp.obj[604].worldX = 73 * gp.tileSize;
        gp.obj[604].worldY = 99 * gp.tileSize;

        gp.obj[605] = new OBJ_88();
        gp.obj[605].worldX = 73 * gp.tileSize;
        gp.obj[605].worldY = 100 * gp.tileSize;

        gp.obj[606] = new OBJ_88();
        gp.obj[606].worldX = 73 * gp.tileSize;
        gp.obj[606].worldY = 101 * gp.tileSize;

        gp.obj[607] = new OBJ_88();
        gp.obj[607].worldX = 73 * gp.tileSize;
        gp.obj[607].worldY = 102 * gp.tileSize;

        gp.obj[608] = new OBJ_88();
        gp.obj[608].worldX = 73 * gp.tileSize;
        gp.obj[608].worldY = 103 * gp.tileSize;

        gp.obj[609] = new OBJ_88();
        gp.obj[609].worldX = 73 * gp.tileSize;
        gp.obj[609].worldY = 104 * gp.tileSize;

        for (int nub = 0, number = 0; nub < 26; nub++) {
            gp.obj[number] = new OBJ_1();
            gp.obj[number].worldX = 21 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_2();
            gp.obj[number].worldX = 22 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_3();
            gp.obj[number].worldX = 23 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_1();
            gp.obj[number].worldX = 25 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_2();
            gp.obj[number].worldX = 26 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_3();
            gp.obj[number].worldX = 27 * gp.tileSize;
            gp.obj[number].worldY = (nub + 31) * gp.tileSize;
            number++;
        }

        for (int nub = 0, number = 663; nub < 35; nub++) {
            gp.obj[number] = new OBJ_1();
            gp.obj[number].worldX = 21 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_2();
            gp.obj[number].worldX = 22 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_3();
            gp.obj[number].worldX = 23 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_1();
            gp.obj[number].worldX = 25 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_2();
            gp.obj[number].worldX = 26 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;

            gp.obj[number] = new OBJ_3();
            gp.obj[number].worldX = 27 * gp.tileSize;
            gp.obj[number].worldY = nub * gp.tileSize;
            number++;
        }

        gp.obj[874] = new OBJ_126();
        gp.obj[874].worldX = 12 * gp.tileSize;
        gp.obj[874].worldY = 17 * gp.tileSize;

        gp.obj[875] = new OBJ_126();
        gp.obj[875].worldX = 12 * gp.tileSize;
        gp.obj[875].worldY = 18 * gp.tileSize;

        gp.obj[876] = new OBJ_126();
        gp.obj[876].worldX = 13 * gp.tileSize;
        gp.obj[876].worldY = 18 * gp.tileSize;

        gp.obj[877] = new OBJ_126();
        gp.obj[877].worldX = 13 * gp.tileSize;
        gp.obj[877].worldY = 19 * gp.tileSize;

        gp.obj[878] = new OBJ_126();
        gp.obj[878].worldX = 13 * gp.tileSize;
        gp.obj[878].worldY = 15 * gp.tileSize;

        for (int nub = 0; nub < 4; nub++) {
            gp.obj[879 + nub] = new OBJ_126();
            gp.obj[879 + nub].worldX = 12 * gp.tileSize;
            gp.obj[879 + nub].worldY = (33 + nub) * gp.tileSize;
        }

        gp.obj[873] = new OBJ_126();
        gp.obj[873].worldX = 14 * gp.tileSize;
        gp.obj[873].worldY = 35 * gp.tileSize;

        for (int nub = 0; nub < 3; nub++) {
            gp.obj[987 + nub] = new OBJ_126();
            gp.obj[987 + nub].worldX = 12 * gp.tileSize;
            gp.obj[987 + nub].worldY = (40 + nub) * gp.tileSize;
        }

        for (int nub = 0; nub < 2; nub++) {
            gp.obj[990 + nub] = new OBJ_126();
            gp.obj[990 + nub].worldX = 13 * gp.tileSize;
            gp.obj[990 + nub].worldY = (41 + nub) * gp.tileSize;
        }
        for (int nub = 0; nub < 2; nub++) {
            gp.obj[992 + nub] = new OBJ_126();
            gp.obj[992 + nub].worldX = 31 * gp.tileSize;
            gp.obj[992 + nub].worldY = (19 + nub) * gp.tileSize;
        }

        gp.obj[999] = new OBJ_126();
        gp.obj[999].worldX = 30 * gp.tileSize;
        gp.obj[999].worldY = 20 * gp.tileSize;

        gp.obj[994] = new OBJ_126();
        gp.obj[994].worldX = 32 * gp.tileSize;
        gp.obj[994].worldY = 28 * gp.tileSize;

        gp.obj[995] = new OBJ_126();
        gp.obj[995].worldX = 31 * gp.tileSize;
        gp.obj[995].worldY = 31 * gp.tileSize;

        for (int nub = 0; nub < 2; nub++) {
            gp.obj[996 + nub] = new OBJ_126();
            gp.obj[996 + nub].worldX = 38 * gp.tileSize;
            gp.obj[996 + nub].worldY = (36 + nub) * gp.tileSize;
        }

        gp.obj[998] = new OBJ_126();
        gp.obj[998].worldX = 39 * gp.tileSize;
        gp.obj[998].worldY = 36 * gp.tileSize;

        for (int nub = 0, i = 1; nub < 3; nub++) {
            gp.obj[1000 + nub] = new OBJ_126();
            gp.obj[1000 + nub].worldX = 81 * gp.tileSize;
            gp.obj[1000 + nub].worldY = (50 + i + nub) * gp.tileSize;
            i *= 2;
        }
        for (int nub = 0; nub < 3; nub++) {
            gp.obj[1003 + nub] = new OBJ_126();
            gp.obj[1003 + nub].worldX = 80 * gp.tileSize;
            gp.obj[1003 + nub].worldY = (52 + nub) * gp.tileSize;
        }
        gp.obj[1006] = new OBJ_126();
        gp.obj[1006].worldX = 81 * gp.tileSize;
        gp.obj[1006].worldY = 57 * gp.tileSize;

        gp.obj[1007] = new OBJ_126();
        gp.obj[1007].worldX = 80 * gp.tileSize;
        gp.obj[1007].worldY = 59 * gp.tileSize;

        for (int nub = 0; nub < 3; nub++) {
            gp.obj[1008 + nub] = new OBJ_126();
            gp.obj[1008 + nub].worldX = (83 + nub) * gp.tileSize;
            gp.obj[1008 + nub].worldY = 66 * gp.tileSize;
        }
        for (int nub = 0; nub < 6; nub++) {
            gp.obj[1011 + nub] = new OBJ_126();
            gp.obj[1011 + nub].worldX = (81 + nub) * gp.tileSize;
            gp.obj[1011 + nub].worldY = 67 * gp.tileSize;
        }
        for (int nub = 0; nub < 2; nub++) {
            gp.obj[1017 + nub] = new OBJ_126();
            gp.obj[1017 + nub].worldX = (80 + (nub * 4)) * gp.tileSize;
            gp.obj[1017 + nub].worldY = 68 * gp.tileSize;
        }
        for (int nub = 0; nub < 2; nub++) {
            gp.obj[1019 + nub] = new OBJ_126();
            gp.obj[1019 + nub].worldX = 82 * gp.tileSize;
            gp.obj[1019 + nub].worldY = (79 + nub) * gp.tileSize;
        }
        for (int nub = 0; nub < 4; nub++) {
            gp.obj[1021 + nub] = new OBJ_126();
            gp.obj[1021 + nub].worldX = (85 + nub) * gp.tileSize;
            gp.obj[1021 + nub].worldY = 80 * gp.tileSize;
        }

        for (int i = 0, nub = 0; i < 15; i += 5) {
            gp.obj[1025 + nub] = new OBJ_23();
            gp.obj[1025 + nub].worldX = 74 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (69 + i) * gp.tileSize;
            nub++;

            gp.obj[1025 + nub] = new OBJ_24();
            gp.obj[1025 + nub].worldX = 75 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (69 + i) * gp.tileSize;
            nub++;

            gp.obj[1025 + nub] = new OBJ_25();
            gp.obj[1025 + nub].worldX = 74 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (70 + i) * gp.tileSize;
            nub++;

            gp.obj[1025 + nub] = new OBJ_26();
            gp.obj[1025 + nub].worldX = 75 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (70 + i) * gp.tileSize;
            nub++;

            gp.obj[1025 + nub] = new OBJ_27();
            gp.obj[1025 + nub].worldX = 74 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (71 + i) * gp.tileSize;
            nub++;

            gp.obj[1025 + nub] = new OBJ_28();
            gp.obj[1025 + nub].worldX = 75 * gp.tileSize;
            gp.obj[1025 + nub].worldY = (71 + i) * gp.tileSize;
            nub++;
        }
        for (int i = 0, nub = 0; i < 4; i += 3) {
            gp.obj[1043 + nub] = new OBJ_23();
            gp.obj[1043 + nub].worldX = (78 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 86 * gp.tileSize;
            nub++;

            gp.obj[1043 + nub] = new OBJ_24();
            gp.obj[1043 + nub].worldX = (79 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 86 * gp.tileSize;
            nub++;

            gp.obj[1043 + nub] = new OBJ_25();
            gp.obj[1043 + nub].worldX = (78 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 87 * gp.tileSize;
            nub++;

            gp.obj[1043 + nub] = new OBJ_26();
            gp.obj[1043 + nub].worldX = (79 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 87 * gp.tileSize;
            nub++;

            gp.obj[1043 + nub] = new OBJ_27();
            gp.obj[1043 + nub].worldX = (78 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 88 * gp.tileSize;
            nub++;

            gp.obj[1043 + nub] = new OBJ_28();
            gp.obj[1043 + nub].worldX = (79 + i) * gp.tileSize;
            gp.obj[1043 + nub].worldY = 88 * gp.tileSize;
            nub++;
        }
        for (int j = 0, nub = 1055; j < 15; j += 3) {
            for (int i = 0; i < 4; i += 3) {
                gp.obj[nub] = new OBJ_23();
                gp.obj[nub].worldX = (78 + i) * gp.tileSize;
                gp.obj[nub].worldY = (91 + j) * gp.tileSize;
                nub++;

                gp.obj[nub] = new OBJ_24();
                gp.obj[nub].worldX = (79 + i) * gp.tileSize;
                gp.obj[nub].worldY = (91 + j) * gp.tileSize;
                nub++;

                gp.obj[nub] = new OBJ_25();
                gp.obj[nub].worldX = (78 + i) * gp.tileSize;
                gp.obj[nub].worldY = (92 + j) * gp.tileSize;
                nub++;

                gp.obj[nub] = new OBJ_26();
                gp.obj[nub].worldX = (79 + i) * gp.tileSize;
                gp.obj[nub].worldY = (92 + j) * gp.tileSize;
                nub++;

                gp.obj[nub] = new OBJ_27();
                gp.obj[nub].worldX = (78 + i) * gp.tileSize;
                gp.obj[nub].worldY = (93 + j) * gp.tileSize;
                nub++;

                gp.obj[nub] = new OBJ_28();
                gp.obj[nub].worldX = (79 + i) * gp.tileSize;
                gp.obj[nub].worldY = (93 + j) * gp.tileSize;
                nub++;
            }
        }
        for (int i = 0, nub = 1115; i < 4; i += 3) {
            gp.obj[nub] = new OBJ_23();
            gp.obj[nub].worldX = (91 + i) * gp.tileSize;
            gp.obj[nub].worldY = 79 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_24();
            gp.obj[nub].worldX = (92 + i) * gp.tileSize;
            gp.obj[nub].worldY = 79 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_25();
            gp.obj[nub].worldX = (91 + i) * gp.tileSize;
            gp.obj[nub].worldY = 80 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_26();
            gp.obj[nub].worldX = (92 + i) * gp.tileSize;
            gp.obj[nub].worldY = 80 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_27();
            gp.obj[nub].worldX = (91 + i) * gp.tileSize;
            gp.obj[nub].worldY = 81 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_28();
            gp.obj[nub].worldX = (92 + i) * gp.tileSize;
            gp.obj[nub].worldY = 81 * gp.tileSize;
            nub++;
        }
        for (int i = 0, nub = 1127; i < 4; i += 3) {
            gp.obj[nub] = new OBJ_23();
            gp.obj[nub].worldX = (93 + i) * gp.tileSize;
            gp.obj[nub].worldY = 66 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_24();
            gp.obj[nub].worldX = (94 + i) * gp.tileSize;
            gp.obj[nub].worldY = 66 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_25();
            gp.obj[nub].worldX = (93 + i) * gp.tileSize;
            gp.obj[nub].worldY = 67 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_26();
            gp.obj[nub].worldX = (94 + i) * gp.tileSize;
            gp.obj[nub].worldY = 67 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_27();
            gp.obj[nub].worldX = (93 + i) * gp.tileSize;
            gp.obj[nub].worldY = 68 * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_28();
            gp.obj[nub].worldX = (94 + i) * gp.tileSize;
            gp.obj[nub].worldY = 68 * gp.tileSize;
            nub++;
        }
        for (int j = 0, nub = 1141; j < 5; j++) {
            if (j == 2) {
                j++;
            }
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (69 + j) * gp.tileSize;
            gp.obj[nub].worldY = (41) * gp.tileSize;
            nub++;
        }
        for (int i = 0, nub = 1146; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                gp.obj[nub] = new OBJ_96();
                gp.obj[nub].worldX = (70 + j) * gp.tileSize;
                gp.obj[nub].worldY = (42 + i) * gp.tileSize;
                nub++;
            }
        }
        for (int j = 0, nub = 1158; j < 4; j++) {
            gp.obj[nub] = new OBJ_97();
            gp.obj[nub].worldX = (70 + j) * gp.tileSize;
            gp.obj[nub].worldY = (45) * gp.tileSize;
            nub++;
        }

        gp.obj[1163] = new OBJ_97();
        gp.obj[1163].worldX = 69 * gp.tileSize;
        gp.obj[1163].worldY = 43 * gp.tileSize;

        gp.obj[1164] = new OBJ_96();
        gp.obj[1164].worldX = 69 * gp.tileSize;
        gp.obj[1164].worldY = 42 * gp.tileSize;

        for (int j = 0, nub = 1165; j < 10; j++) {
            if (j == 2 | j == 7 | j == 9) {
                gp.obj[nub] = new OBJ_97();
            } else {
                gp.obj[nub] = new OBJ_96();
            }
            gp.obj[nub].worldX = (75) * gp.tileSize;
            gp.obj[nub].worldY = (42 + j) * gp.tileSize;
            nub++;
        }
        for (int j = 0, nub = 1175; j < 7; j++) {
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (76) * gp.tileSize;
            gp.obj[nub].worldY = (44 + j) * gp.tileSize;
            nub++;
        }
        for (int j = 0, nub = 1182; j < 4; j++) {
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (77) * gp.tileSize;
            gp.obj[nub].worldY = (45 + j) * gp.tileSize;
            nub++;
        }
        gp.obj[1190] = new OBJ_97();
        gp.obj[1190].worldX = 76 * gp.tileSize;
        gp.obj[1190].worldY = 51 * gp.tileSize;

        gp.obj[1186] = new OBJ_97();
        gp.obj[1186].worldX = 77 * gp.tileSize;
        gp.obj[1186].worldY = 49 * gp.tileSize;

        for (int j = 0, nub = 1187; j < 2; j++) {
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (74) * gp.tileSize;
            gp.obj[nub].worldY = (44 + j) * gp.tileSize;
            nub++;
        }
        gp.obj[1189] = new OBJ_97();
        gp.obj[1189].worldX = 74 * gp.tileSize;
        gp.obj[1189].worldY = 46 * gp.tileSize;

        for (int j = 0, nub = 1191; j < 8; j++) {
            if (j == 2 | j == 7) {
                gp.obj[nub] = new OBJ_97();
            } else if (j == 0 | j == 1 | j == 6) {
                gp.obj[nub] = new OBJ_96();
            } else {
                continue;
            }
            gp.obj[nub].worldX = (76) * gp.tileSize;
            gp.obj[nub].worldY = (54 + j) * gp.tileSize;
            nub++;
        }
        gp.obj[1196] = new OBJ_96();
        gp.obj[1196].worldX = 75 * gp.tileSize;
        gp.obj[1196].worldY = 63 * gp.tileSize;

        gp.obj[1197] = new OBJ_97();
        gp.obj[1197].worldX = 75 * gp.tileSize;
        gp.obj[1197].worldY = 64 * gp.tileSize;

        for (int j = 0, nub = 1198; j < 8; j++) {
            if (j == 1 | j == 4 | j == 7) {
                gp.obj[nub] = new OBJ_97();
            } else if (j == 5) {
                continue;
            } else {
                gp.obj[nub] = new OBJ_96();
            }
            gp.obj[nub].worldX = (77) * gp.tileSize;
            gp.obj[nub].worldY = (55 + j) * gp.tileSize;
            nub++;
        }
        for (int j = 0, nub = 1205; j < 5; j++) {
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (78) * gp.tileSize;
            gp.obj[nub].worldY = (55 + j) * gp.tileSize;
            nub++;
        }
        gp.obj[1210] = new OBJ_97();
        gp.obj[1210].worldX = 78 * gp.tileSize;
        gp.obj[1210].worldY = 60 * gp.tileSize;

        for (int j = 0, nub = 1211; j < 4; j++) {
            gp.obj[nub] = new OBJ_96();
            gp.obj[nub].worldX = (84 + j) * gp.tileSize;
            gp.obj[nub].worldY = 37 * gp.tileSize;
            nub++;
        }
        for (int i = 0, nub = 1215; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i == 0 & j == 1) | (i == 1 & j == 0) | (i == 2 & (j != 0 & j != 1 & j != 4))) {
                    gp.obj[nub] = new OBJ_97();
                } else if (i == 0 & j == 8) {
                    continue;
                } else {
                    gp.obj[nub] = new OBJ_96();
                }
                gp.obj[nub].worldX = (83 + j) * gp.tileSize;
                gp.obj[nub].worldY = (38 + i) * gp.tileSize;
                nub++;
            }
        }
        for (int i = 0, nub = 1241; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if ((i == 1 & j == 0) | (i == 2 & j == 3) | (i == 2 & j == 2) | (i == 1 & j == 4)) {
                    gp.obj[nub] = new OBJ_97();
                } else if (i == 2 & (j == 0 | j == 4)) {
                    continue;
                } else {
                    gp.obj[nub] = new OBJ_96();
                }
                gp.obj[nub].worldX = (83 + j) * gp.tileSize;
                gp.obj[nub].worldY = (41 + i) * gp.tileSize;
                nub++;
            }
        }

        gp.obj[1254] = new OBJ_97();
        gp.obj[1254].worldX = 84 * gp.tileSize;
        gp.obj[1254].worldY = 44 * gp.tileSize;

        for (int i = 0, nub = 1255; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == 1 & j == 0) | (i == 2 & j != 0)) {
                    gp.obj[nub] = new OBJ_97();
                } else if ((i == 2 & j == 0) | (i == 0 & j == 3)) {
                    continue;
                } else {
                    gp.obj[nub] = new OBJ_96();
                }
                gp.obj[nub].worldX = (89 + j) * gp.tileSize;
                gp.obj[nub].worldY = (56 + i) * gp.tileSize;
                nub++;
            }
        }

        for (int i = 0, nub = 1265; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == 1 & j == 0) | (i == 2 & j != 0)) {
                    gp.obj[nub] = new OBJ_97();
                } else if ((i == 2 & j == 0) | (i == 0 & j == 3)) {
                    continue;
                } else {
                    gp.obj[nub] = new OBJ_96();
                }
                gp.obj[nub].worldX = (84 + j) * gp.tileSize;
                gp.obj[nub].worldY = (62 + i) * gp.tileSize;
                nub++;
            }
        }

        for (int i = 0, nub = 1275; i < 4; i += 3) {
            gp.obj[nub] = new OBJ_66();
            gp.obj[nub].worldX = 83 * gp.tileSize;
            gp.obj[nub].worldY = (47 + i) * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_99();
            gp.obj[nub].worldX = 84 * gp.tileSize;
            gp.obj[nub].worldY = (47 + i) * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_67();
            gp.obj[nub].worldX = 83 * gp.tileSize;
            gp.obj[nub].worldY = (48 + i) * gp.tileSize;
            nub++;

            gp.obj[nub] = new OBJ_100();
            gp.obj[nub].worldX = 84 * gp.tileSize;
            gp.obj[nub].worldY = (48 + i) * gp.tileSize;
            nub++;
        }

        gp.obj[1283] = new OBJ_99();
        gp.obj[1283].worldX = 78 * gp.tileSize;
        gp.obj[1283].worldY = (50) * gp.tileSize;

        gp.obj[1284] = new OBJ_100();
        gp.obj[1284].worldX = 78 * gp.tileSize;
        gp.obj[1284].worldY = (51) * gp.tileSize;

        gp.obj[1285] = new OBJ_127();
        gp.obj[1285].worldX = 84 * gp.tileSize;
        gp.obj[1285].worldY = (90) * gp.tileSize;

        gp.obj[1286] = new OBJ_127();
        gp.obj[1286].worldX = 84 * gp.tileSize;
        gp.obj[1286].worldY = (91) * gp.tileSize;

        gp.obj[1288] = new OBJ_Egg();
        gp.obj[1288].worldX = 13 * gp.tileSize;
        gp.obj[1288].worldY = 46 * gp.tileSize;

        gp.obj[1289] = new OBJ_Egg();
        gp.obj[1289].worldX = 87 * gp.tileSize;
        gp.obj[1289].worldY = 47 * gp.tileSize;

        gp.obj[1290] = new OBJ_Egg();
        gp.obj[1290].worldX = 75 * gp.tileSize;
        gp.obj[1290].worldY = 55 * gp.tileSize;

        gp.obj[1291] = new OBJ_Egg();
        gp.obj[1291].worldX = 92 * gp.tileSize;
        gp.obj[1291].worldY = 78 * gp.tileSize;

        gp.obj[1292] = new OBJ_Eunji(gp);
        gp.obj[1292].worldX = 80 * gp.tileSize;
        gp.obj[1292].worldY = 56 * gp.tileSize;

        gp.obj[1293] = new OBJ_Eunji(gp);
        gp.obj[1293].worldX = 77 * gp.tileSize;
        gp.obj[1293].worldY = 88 * gp.tileSize;

        gp.obj[1294] = new OBJ_Eunji(gp);
        gp.obj[1294].worldX = 13 * gp.tileSize;
        gp.obj[1294].worldY = 30 * gp.tileSize;

        gp.obj[1295] = new OBJ_Eunji(gp);
        gp.obj[1295].worldX = 32 * gp.tileSize;
        gp.obj[1295].worldY = 34 * gp.tileSize;

        gp.obj[1296] = new OBJ_Eunji(gp);
        gp.obj[1296].worldX = 78 * gp.tileSize;
        gp.obj[1296].worldY = 40 * gp.tileSize;

        gp.obj[1297] = new OBJ_Egg();
        gp.obj[1297].worldX = 14 * gp.tileSize;
        gp.obj[1297].worldY = 24 * gp.tileSize;

        gp.obj[1298] = new OBJ_Eunji(gp);
        gp.obj[1298].worldX = 69 * gp.tileSize;
        gp.obj[1298].worldY = 46 * gp.tileSize;
    }
}
