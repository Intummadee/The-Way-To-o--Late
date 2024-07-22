package tile;

import java.awt.Graphics2D;
import java.io.*;
import javax.imageio.ImageIO;
import main.GamePanel;
import main.UtilityTool;

public class TileManager {

    GamePanel gp;
    public Tile[] tile;
    public int mapTileNum[][];

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[300];

        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];

        getTileImage();
        loadMap("/maps/world01.txt");

    }

    public void getTileImage() {

        try {

            tile[0] = new Tile();
            tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/"));
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/1.png"));
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/2.png"));
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/3.png"));
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/4.png"));
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/5.png"));
            tile[6] = new Tile();
            tile[6].image = ImageIO.read(getClass().getResourceAsStream("/tiles/6.png"));
            tile[7] = new Tile();
            tile[7].image = ImageIO.read(getClass().getResourceAsStream("/tiles/7.png"));
            tile[8] = new Tile();
            tile[8].image = ImageIO.read(getClass().getResourceAsStream("/tiles/8.png"));
            tile[9] = new Tile();
            tile[9].image = ImageIO.read(getClass().getResourceAsStream("/tiles/9.png"));
            tile[10] = new Tile();
            tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/10.png"));
            tile[11] = new Tile();
            tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/11.png"));
            tile[12] = new Tile();
            tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/12.png"));
            tile[13] = new Tile();
            tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/13.png"));
            tile[14] = new Tile();
            tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/14.png"));
            tile[15] = new Tile();
            tile[15].image = ImageIO.read(getClass().getResourceAsStream("/tiles/15.png"));
            tile[16] = new Tile();
            tile[16].image = ImageIO.read(getClass().getResourceAsStream("/tiles/16.png"));
            tile[17] = new Tile();
            tile[17].image = ImageIO.read(getClass().getResourceAsStream("/tiles/17.png"));
            tile[18] = new Tile();
            tile[18].image = ImageIO.read(getClass().getResourceAsStream("/tiles/18.png"));
            tile[19] = new Tile();
            tile[19].image = ImageIO.read(getClass().getResourceAsStream("/tiles/19.png"));
            tile[20] = new Tile();
            tile[20].image = ImageIO.read(getClass().getResourceAsStream("/tiles/20.png"));
            tile[21] = new Tile();
            tile[21].image = ImageIO.read(getClass().getResourceAsStream("/tiles/21.png"));
            tile[22] = new Tile();
            tile[22].image = ImageIO.read(getClass().getResourceAsStream("/tiles/22.png"));
            tile[23] = new Tile();
            tile[23].image = ImageIO.read(getClass().getResourceAsStream("/tiles/23.png"));
            tile[24] = new Tile();
            tile[24].image = ImageIO.read(getClass().getResourceAsStream("/tiles/24.png"));
            tile[25] = new Tile();
            tile[25].image = ImageIO.read(getClass().getResourceAsStream("/tiles/25.png"));
            tile[26] = new Tile();
            tile[26].image = ImageIO.read(getClass().getResourceAsStream("/tiles/26.png"));
            tile[27] = new Tile();
            tile[27].image = ImageIO.read(getClass().getResourceAsStream("/tiles/27.png"));
            tile[28] = new Tile();
            tile[28].image = ImageIO.read(getClass().getResourceAsStream("/tiles/28.png"));
            tile[29] = new Tile();
            tile[29].image = ImageIO.read(getClass().getResourceAsStream("/tiles/29.png"));
            tile[30] = new Tile();
            tile[30].image = ImageIO.read(getClass().getResourceAsStream("/tiles/30.png"));
            tile[31] = new Tile();
            tile[31].image = ImageIO.read(getClass().getResourceAsStream("/tiles/31.png"));
            tile[32] = new Tile();
            tile[32].image = ImageIO.read(getClass().getResourceAsStream("/tiles/32.png"));
            tile[33] = new Tile();
            tile[33].image = ImageIO.read(getClass().getResourceAsStream("/tiles/33.png"));
            tile[34] = new Tile();
            tile[34].image = ImageIO.read(getClass().getResourceAsStream("/tiles/34.png"));
            tile[35] = new Tile();
            tile[35].image = ImageIO.read(getClass().getResourceAsStream("/tiles/35.png"));
            tile[36] = new Tile();
            tile[36].image = ImageIO.read(getClass().getResourceAsStream("/tiles/36.png"));
            tile[37] = new Tile();
            tile[37].image = ImageIO.read(getClass().getResourceAsStream("/tiles/37.png"));
            tile[38] = new Tile();
            tile[38].image = ImageIO.read(getClass().getResourceAsStream("/tiles/38.png"));
            tile[39] = new Tile();
            tile[39].image = ImageIO.read(getClass().getResourceAsStream("/tiles/39.png"));
            tile[40] = new Tile();
            tile[40].image = ImageIO.read(getClass().getResourceAsStream("/tiles/40.png"));
            tile[41] = new Tile();
            tile[41].image = ImageIO.read(getClass().getResourceAsStream("/tiles/41.png"));
            tile[42] = new Tile();
            tile[42].image = ImageIO.read(getClass().getResourceAsStream("/tiles/42.png"));
            tile[43] = new Tile();
            tile[43].image = ImageIO.read(getClass().getResourceAsStream("/tiles/43.png"));
            tile[44] = new Tile();
            tile[44].image = ImageIO.read(getClass().getResourceAsStream("/tiles/44.png"));
            tile[45] = new Tile();
            tile[45].image = ImageIO.read(getClass().getResourceAsStream("/tiles/45.png"));
            tile[46] = new Tile();
            tile[46].image = ImageIO.read(getClass().getResourceAsStream("/tiles/46.png"));
            tile[47] = new Tile();
            tile[47].image = ImageIO.read(getClass().getResourceAsStream("/tiles/47.png"));
            tile[48] = new Tile();
            tile[48].image = ImageIO.read(getClass().getResourceAsStream("/tiles/48.png"));
            tile[49] = new Tile();
            tile[49].image = ImageIO.read(getClass().getResourceAsStream("/tiles/49.png"));
            tile[50] = new Tile();
            tile[50].image = ImageIO.read(getClass().getResourceAsStream("/tiles/50.png"));
            tile[51] = new Tile();
            tile[51].image = ImageIO.read(getClass().getResourceAsStream("/tiles/51.png"));
            tile[52] = new Tile();
            tile[52].image = ImageIO.read(getClass().getResourceAsStream("/tiles/52.png"));
            tile[53] = new Tile();
            tile[53].image = ImageIO.read(getClass().getResourceAsStream("/tiles/53.png"));
            tile[54] = new Tile();
            tile[54].image = ImageIO.read(getClass().getResourceAsStream("/tiles/54.png"));
            tile[55] = new Tile();
            tile[55].image = ImageIO.read(getClass().getResourceAsStream("/tiles/55.png"));
            tile[56] = new Tile();
            tile[56].image = ImageIO.read(getClass().getResourceAsStream("/tiles/56.png"));
            tile[57] = new Tile();
            tile[57].image = ImageIO.read(getClass().getResourceAsStream("/tiles/57.png"));
            tile[58] = new Tile();
            tile[58].image = ImageIO.read(getClass().getResourceAsStream("/tiles/58.png"));
            tile[59] = new Tile();
            tile[59].image = ImageIO.read(getClass().getResourceAsStream("/tiles/59.png"));
            tile[60] = new Tile();
            tile[60].image = ImageIO.read(getClass().getResourceAsStream("/tiles/60.png"));
            tile[61] = new Tile();
            tile[61].image = ImageIO.read(getClass().getResourceAsStream("/tiles/61.png"));
            tile[62] = new Tile();
            tile[62].image = ImageIO.read(getClass().getResourceAsStream("/tiles/62.png"));
            tile[63] = new Tile();
            tile[63].image = ImageIO.read(getClass().getResourceAsStream("/tiles/63.png"));
            tile[64] = new Tile();
            tile[64].image = ImageIO.read(getClass().getResourceAsStream("/tiles/64.png"));
            tile[65] = new Tile();
            tile[65].image = ImageIO.read(getClass().getResourceAsStream("/tiles/65.png"));
            tile[66] = new Tile();
            tile[66].image = ImageIO.read(getClass().getResourceAsStream("/tiles/66.png"));
            tile[67] = new Tile();
            tile[67].image = ImageIO.read(getClass().getResourceAsStream("/tiles/67.png"));
            tile[68] = new Tile();
            tile[68].image = ImageIO.read(getClass().getResourceAsStream("/tiles/68.png"));
            tile[69] = new Tile();
            tile[69].image = ImageIO.read(getClass().getResourceAsStream("/tiles/69.png"));
            tile[70] = new Tile();
            tile[70].image = ImageIO.read(getClass().getResourceAsStream("/tiles/70.png"));
            tile[71] = new Tile();
            tile[71].image = ImageIO.read(getClass().getResourceAsStream("/tiles/71.png"));
            tile[72] = new Tile();
            tile[72].image = ImageIO.read(getClass().getResourceAsStream("/tiles/72.png"));
            tile[73] = new Tile();
            tile[73].image = ImageIO.read(getClass().getResourceAsStream("/tiles/73.png"));
            tile[74] = new Tile();
            tile[74].image = ImageIO.read(getClass().getResourceAsStream("/tiles/74.png"));
            tile[75] = new Tile();
            tile[75].image = ImageIO.read(getClass().getResourceAsStream("/tiles/75.png"));
            tile[76] = new Tile();
            tile[76].image = ImageIO.read(getClass().getResourceAsStream("/tiles/76.png"));
            tile[77] = new Tile();
            tile[77].image = ImageIO.read(getClass().getResourceAsStream("/tiles/77.png"));
            tile[78] = new Tile();
            tile[78].image = ImageIO.read(getClass().getResourceAsStream("/tiles/78.png"));
            tile[79] = new Tile();
            tile[79].image = ImageIO.read(getClass().getResourceAsStream("/tiles/79.png"));
            tile[80] = new Tile();
            tile[80].image = ImageIO.read(getClass().getResourceAsStream("/tiles/80.png"));
            tile[81] = new Tile();
            tile[81].image = ImageIO.read(getClass().getResourceAsStream("/tiles/81.png"));
            tile[82] = new Tile();
            tile[82].image = ImageIO.read(getClass().getResourceAsStream("/tiles/82.png"));
            tile[83] = new Tile();
            tile[83].image = ImageIO.read(getClass().getResourceAsStream("/tiles/83.png"));
            tile[84] = new Tile();
            tile[84].image = ImageIO.read(getClass().getResourceAsStream("/tiles/84.png"));
            tile[85] = new Tile();
            tile[85].image = ImageIO.read(getClass().getResourceAsStream("/tiles/85.png"));
            tile[86] = new Tile();
            tile[86].image = ImageIO.read(getClass().getResourceAsStream("/tiles/86.png"));
            tile[87] = new Tile();
            tile[87].image = ImageIO.read(getClass().getResourceAsStream("/tiles/87.png"));
            tile[88] = new Tile();
            tile[88].image = ImageIO.read(getClass().getResourceAsStream("/tiles/88.png"));
            tile[89] = new Tile();
            tile[89].image = ImageIO.read(getClass().getResourceAsStream("/tiles/89.png"));
            tile[90] = new Tile();
            tile[90].image = ImageIO.read(getClass().getResourceAsStream("/tiles/90.png"));
            tile[91] = new Tile();
            tile[91].image = ImageIO.read(getClass().getResourceAsStream("/tiles/91.png"));
            tile[92] = new Tile();
            tile[92].image = ImageIO.read(getClass().getResourceAsStream("/tiles/92.png"));
            tile[93] = new Tile();
            tile[93].image = ImageIO.read(getClass().getResourceAsStream("/tiles/93.png"));
            tile[94] = new Tile();
            tile[94].image = ImageIO.read(getClass().getResourceAsStream("/tiles/94.png"));
            tile[95] = new Tile();
            tile[95].image = ImageIO.read(getClass().getResourceAsStream("/tiles/95.png"));
            tile[96] = new Tile();
            tile[96].image = ImageIO.read(getClass().getResourceAsStream("/tiles/96.png"));
            tile[97] = new Tile();
            tile[97].image = ImageIO.read(getClass().getResourceAsStream("/tiles/97.png"));
            tile[98] = new Tile();
            tile[98].image = ImageIO.read(getClass().getResourceAsStream("/tiles/98.png"));
            tile[99] = new Tile();
            tile[99].image = ImageIO.read(getClass().getResourceAsStream("/tiles/99.png"));
            tile[100] = new Tile();
            tile[100].image = ImageIO.read(getClass().getResourceAsStream("/tiles/100.png"));
            tile[101] = new Tile();
            tile[101].image = ImageIO.read(getClass().getResourceAsStream("/tiles/101.png"));
            tile[102] = new Tile();
            tile[102].image = ImageIO.read(getClass().getResourceAsStream("/tiles/102.png"));
            tile[103] = new Tile();
            tile[103].image = ImageIO.read(getClass().getResourceAsStream("/tiles/103.png"));
            tile[104] = new Tile();
            tile[104].image = ImageIO.read(getClass().getResourceAsStream("/tiles/104.png"));
            tile[105] = new Tile();
            tile[105].image = ImageIO.read(getClass().getResourceAsStream("/tiles/105.png"));
            tile[106] = new Tile();
            tile[106].image = ImageIO.read(getClass().getResourceAsStream("/tiles/106.png"));
            tile[107] = new Tile();
            tile[107].image = ImageIO.read(getClass().getResourceAsStream("/tiles/107.png"));
            tile[108] = new Tile();
            tile[108].image = ImageIO.read(getClass().getResourceAsStream("/tiles/108.png"));
            tile[109] = new Tile();
            tile[109].image = ImageIO.read(getClass().getResourceAsStream("/tiles/109.png"));
            tile[110] = new Tile();
            tile[110].image = ImageIO.read(getClass().getResourceAsStream("/tiles/110.png"));
            tile[111] = new Tile();
            tile[111].image = ImageIO.read(getClass().getResourceAsStream("/tiles/111.png"));
            tile[112] = new Tile();
            tile[112].image = ImageIO.read(getClass().getResourceAsStream("/tiles/112.png"));
            tile[113] = new Tile();
            tile[113].image = ImageIO.read(getClass().getResourceAsStream("/tiles/113.png"));
            tile[114] = new Tile();
            tile[114].image = ImageIO.read(getClass().getResourceAsStream("/tiles/114.png"));
            tile[115] = new Tile();
            tile[115].image = ImageIO.read(getClass().getResourceAsStream("/tiles/115.png"));
            tile[116] = new Tile();
            tile[116].image = ImageIO.read(getClass().getResourceAsStream("/tiles/116.png"));
            tile[117] = new Tile();
            tile[117].image = ImageIO.read(getClass().getResourceAsStream("/tiles/117.png"));
            tile[118] = new Tile();
            tile[118].image = ImageIO.read(getClass().getResourceAsStream("/tiles/118.png"));
            tile[119] = new Tile();
            tile[119].image = ImageIO.read(getClass().getResourceAsStream("/tiles/119.png"));
            tile[120] = new Tile();
            tile[120].image = ImageIO.read(getClass().getResourceAsStream("/tiles/120.png"));
            tile[121] = new Tile();
            tile[121].image = ImageIO.read(getClass().getResourceAsStream("/tiles/121.png"));
            tile[122] = new Tile();
            tile[122].image = ImageIO.read(getClass().getResourceAsStream("/tiles/122.png"));
            tile[123] = new Tile();
            tile[123].image = ImageIO.read(getClass().getResourceAsStream("/tiles/123.png"));
            tile[124] = new Tile();
            tile[124].image = ImageIO.read(getClass().getResourceAsStream("/tiles/124.png"));
            tile[125] = new Tile();
            tile[125].image = ImageIO.read(getClass().getResourceAsStream("/tiles/125.png"));
            tile[126] = new Tile();
            tile[126].image = ImageIO.read(getClass().getResourceAsStream("/tiles/126.png"));
            tile[127] = new Tile();
            tile[127].image = ImageIO.read(getClass().getResourceAsStream("/tiles/127.png"));
            tile[128] = new Tile();
            tile[128].image = ImageIO.read(getClass().getResourceAsStream("/tiles/128.png"));
            tile[129] = new Tile();
            tile[129].image = ImageIO.read(getClass().getResourceAsStream("/tiles/129.png"));
            tile[130] = new Tile();
            tile[130].image = ImageIO.read(getClass().getResourceAsStream("/tiles/130.png"));
            tile[131] = new Tile();
            tile[131].image = ImageIO.read(getClass().getResourceAsStream("/tiles/131.png"));
            tile[132] = new Tile();
            tile[132].image = ImageIO.read(getClass().getResourceAsStream("/tiles/132.png"));
            tile[133] = new Tile();
            tile[133].image = ImageIO.read(getClass().getResourceAsStream("/tiles/133.png"));
            tile[134] = new Tile();
            tile[134].image = ImageIO.read(getClass().getResourceAsStream("/tiles/134.png"));
            tile[135] = new Tile();
            tile[135].image = ImageIO.read(getClass().getResourceAsStream("/tiles/135.png"));
            tile[136] = new Tile();
            tile[136].image = ImageIO.read(getClass().getResourceAsStream("/tiles/136.png"));
            tile[137] = new Tile();
            tile[137].image = ImageIO.read(getClass().getResourceAsStream("/tiles/137.png"));
            tile[138] = new Tile();
            tile[138].image = ImageIO.read(getClass().getResourceAsStream("/tiles/138.png"));
            tile[139] = new Tile();
            tile[139].image = ImageIO.read(getClass().getResourceAsStream("/tiles/139.png"));
            tile[140] = new Tile();
            tile[140].image = ImageIO.read(getClass().getResourceAsStream("/tiles/140.png"));
            tile[141] = new Tile();
            tile[141].image = ImageIO.read(getClass().getResourceAsStream("/tiles/141.png"));
            tile[142] = new Tile();
            tile[142].image = ImageIO.read(getClass().getResourceAsStream("/tiles/142.png"));
            tile[143] = new Tile();
            tile[143].image = ImageIO.read(getClass().getResourceAsStream("/tiles/143.png"));
            tile[144] = new Tile();
            tile[144].image = ImageIO.read(getClass().getResourceAsStream("/tiles/144.png"));
            tile[145] = new Tile();
            tile[145].image = ImageIO.read(getClass().getResourceAsStream("/tiles/145.png"));
            tile[146] = new Tile();
            tile[146].image = ImageIO.read(getClass().getResourceAsStream("/tiles/146.png"));
            tile[147] = new Tile();
            tile[147].image = ImageIO.read(getClass().getResourceAsStream("/tiles/147.png"));
            tile[148] = new Tile();
            tile[148].image = ImageIO.read(getClass().getResourceAsStream("/tiles/148.png"));
            tile[149] = new Tile();
            tile[149].image = ImageIO.read(getClass().getResourceAsStream("/tiles/149.png"));
            tile[150] = new Tile();
            tile[150].image = ImageIO.read(getClass().getResourceAsStream("/tiles/150.png"));
            tile[151] = new Tile();
            tile[151].image = ImageIO.read(getClass().getResourceAsStream("/tiles/151.png"));
            tile[152] = new Tile();
            tile[152].image = ImageIO.read(getClass().getResourceAsStream("/tiles/152.png"));
            tile[153] = new Tile();
            tile[153].image = ImageIO.read(getClass().getResourceAsStream("/tiles/153.png"));
            tile[154] = new Tile();
            tile[154].image = ImageIO.read(getClass().getResourceAsStream("/tiles/154.png"));
            tile[155] = new Tile();
            tile[155].image = ImageIO.read(getClass().getResourceAsStream("/tiles/155.png"));
            tile[156] = new Tile();
            tile[156].image = ImageIO.read(getClass().getResourceAsStream("/tiles/156.png"));
            tile[157] = new Tile();
            tile[157].image = ImageIO.read(getClass().getResourceAsStream("/tiles/157.png"));
            tile[158] = new Tile();
            tile[158].image = ImageIO.read(getClass().getResourceAsStream("/tiles/158.png"));
            tile[159] = new Tile();
            tile[159].image = ImageIO.read(getClass().getResourceAsStream("/tiles/159.png"));
            tile[160] = new Tile();
            tile[160].image = ImageIO.read(getClass().getResourceAsStream("/tiles/160.png"));
            tile[161] = new Tile();
            tile[161].image = ImageIO.read(getClass().getResourceAsStream("/tiles/161.png"));
            tile[162] = new Tile();
            tile[162].image = ImageIO.read(getClass().getResourceAsStream("/tiles/162.png"));
            tile[163] = new Tile();
            tile[163].image = ImageIO.read(getClass().getResourceAsStream("/tiles/163.png"));
            tile[164] = new Tile();
            tile[164].image = ImageIO.read(getClass().getResourceAsStream("/tiles/164.png"));
            tile[165] = new Tile();
            tile[165].image = ImageIO.read(getClass().getResourceAsStream("/tiles/165.png"));
            tile[166] = new Tile();
            tile[166].image = ImageIO.read(getClass().getResourceAsStream("/tiles/166.png"));
            tile[167] = new Tile();
            tile[167].image = ImageIO.read(getClass().getResourceAsStream("/tiles/167.png"));
            tile[168] = new Tile();
            tile[168].image = ImageIO.read(getClass().getResourceAsStream("/tiles/168.png"));
            tile[169] = new Tile();
            tile[169].image = ImageIO.read(getClass().getResourceAsStream("/tiles/169.png"));
            tile[170] = new Tile();
            tile[170].image = ImageIO.read(getClass().getResourceAsStream("/tiles/170.png"));
            tile[171] = new Tile();
            tile[171].image = ImageIO.read(getClass().getResourceAsStream("/tiles/171.png"));
            tile[172] = new Tile();
            tile[172].image = ImageIO.read(getClass().getResourceAsStream("/tiles/172.png"));
            tile[173] = new Tile();
            tile[173].image = ImageIO.read(getClass().getResourceAsStream("/tiles/173.png"));
            tile[174] = new Tile();
            tile[174].image = ImageIO.read(getClass().getResourceAsStream("/tiles/174.png"));
            tile[175] = new Tile();
            tile[175].image = ImageIO.read(getClass().getResourceAsStream("/tiles/175.png"));
            tile[176] = new Tile();
            tile[176].image = ImageIO.read(getClass().getResourceAsStream("/tiles/176.png"));
            tile[177] = new Tile();
            tile[177].image = ImageIO.read(getClass().getResourceAsStream("/tiles/177.png"));
            tile[178] = new Tile();
            tile[178].image = ImageIO.read(getClass().getResourceAsStream("/tiles/178.png"));
            tile[179] = new Tile();
            tile[179].image = ImageIO.read(getClass().getResourceAsStream("/tiles/179.png"));
            tile[180] = new Tile();
            tile[180].image = ImageIO.read(getClass().getResourceAsStream("/tiles/180.png"));
            tile[181] = new Tile();
            tile[181].image = ImageIO.read(getClass().getResourceAsStream("/tiles/181.png"));
            tile[182] = new Tile();
            tile[182].image = ImageIO.read(getClass().getResourceAsStream("/tiles/182.png"));
            tile[183] = new Tile();
            tile[183].image = ImageIO.read(getClass().getResourceAsStream("/tiles/183.png"));
            tile[184] = new Tile();
            tile[184].image = ImageIO.read(getClass().getResourceAsStream("/tiles/184.png"));
            tile[185] = new Tile();
            tile[185].image = ImageIO.read(getClass().getResourceAsStream("/tiles/185.png"));
            tile[186] = new Tile();
            tile[186].image = ImageIO.read(getClass().getResourceAsStream("/tiles/186.png"));
            tile[187] = new Tile();
            tile[187].image = ImageIO.read(getClass().getResourceAsStream("/tiles/187.png"));
            tile[188] = new Tile();
            tile[188].image = ImageIO.read(getClass().getResourceAsStream("/tiles/188.png"));
            tile[189] = new Tile();
            tile[189].image = ImageIO.read(getClass().getResourceAsStream("/tiles/189.png"));
            tile[190] = new Tile();
            tile[190].image = ImageIO.read(getClass().getResourceAsStream("/tiles/190.png"));
            tile[191] = new Tile();
            tile[191].image = ImageIO.read(getClass().getResourceAsStream("/tiles/191.png"));
            tile[192] = new Tile();
            tile[192].image = ImageIO.read(getClass().getResourceAsStream("/tiles/192.png"));
            tile[193] = new Tile();
            tile[193].image = ImageIO.read(getClass().getResourceAsStream("/tiles/193.png"));
            tile[194] = new Tile();
            tile[194].image = ImageIO.read(getClass().getResourceAsStream("/tiles/194.png"));
            tile[195] = new Tile();
            tile[195].image = ImageIO.read(getClass().getResourceAsStream("/tiles/195.png"));
            tile[196] = new Tile();
            tile[196].image = ImageIO.read(getClass().getResourceAsStream("/tiles/196.png"));
            tile[197] = new Tile();
            tile[197].image = ImageIO.read(getClass().getResourceAsStream("/tiles/197.png"));
            tile[198] = new Tile();
            tile[198].image = ImageIO.read(getClass().getResourceAsStream("/tiles/198.png"));
            tile[199] = new Tile();
            tile[199].image = ImageIO.read(getClass().getResourceAsStream("/tiles/199.png"));
            tile[200] = new Tile();
            tile[200].image = ImageIO.read(getClass().getResourceAsStream("/tiles/200.png"));
            tile[201] = new Tile();
            tile[201].image = ImageIO.read(getClass().getResourceAsStream("/tiles/201.png"));
            tile[5].collision = true;
            tile[9].collision = true;
            tile[10].collision = true;
            tile[11].collision = true;
            tile[12].collision = true;
            tile[13].collision = true;
            tile[14].collision = true;
            tile[15].collision = true;
            tile[16].collision = true;
            tile[17].collision = true;
            tile[18].collision = true;
            tile[19].collision = true;
            tile[21].collision = true;
            tile[22].collision = true;
            tile[23].collision = true;
            tile[24].collision = true;
            tile[25].collision = true;
            tile[26].collision = true;
            tile[27].collision = true;
            tile[28].collision = true;
            tile[39].collision = true;
            tile[40].collision = true;
            tile[41].collision = true;
            tile[43].collision = true;
            tile[47].collision = true;
            tile[48].collision = true;
            tile[49].collision = true;
            tile[46].collision = true;
            tile[50].collision = true;
            tile[51].collision = true;
            tile[52].collision = true;
            tile[53].collision = true;
            tile[54].collision = true;
            tile[56].collision = true;
            tile[61].collision = true;
            tile[62].collision = true;
            tile[71].collision = true;
            tile[72].collision = true;
            tile[73].collision = true;
            tile[83].collision = true;
            tile[84].collision = true;
            tile[85].collision = true;
            tile[86].collision = true;
            tile[87].collision = true;
            tile[93].collision = true;
            tile[94].collision = true;
            tile[120].collision = true;
            tile[121].collision = true;
            tile[122].collision = true;
            tile[123].collision = true;
            tile[124].collision = true;
            tile[125].collision = true;
            tile[126].collision = true;
            tile[127].collision = true;
            tile[128].collision = true;
            tile[129].collision = true;
            tile[130].collision = true;
            tile[131].collision = true;
            tile[132].collision = true;
            tile[135].collision = true;
            tile[136].collision = true;
            tile[137].collision = true;
            tile[138].collision = true;
            tile[139].collision = true;
            tile[140].collision = true;
            tile[141].collision = true;
            tile[144].collision = true;
            tile[145].collision = true;
            tile[146].collision = true;
            tile[148].collision = true;
            tile[149].collision = true;
            tile[161].collision = true;
            tile[162].collision = true;
            tile[165].collision = true;
            tile[166].collision = true;
            tile[167].collision = true;
            tile[168].collision = true;
            tile[169].collision = true;
            tile[170].collision = true;
            tile[187].collision = true;
            tile[190].collision = true;
            tile[191].collision = true;
            tile[194].collision = true;
            tile[195].collision = true;
            tile[196].collision = true;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadMap(String filePath) {
        try {
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {

                String line = br.readLine();

                while (col < gp.maxWorldCol) {
                    String numbers[] = line.split(" ");

                    int num = Integer.parseInt(numbers[col]);

                    mapTileNum[col][row] = num;
                    col++;

                }
                if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }

            }
            br.close();
        } catch (Exception e) {

        }
    }
    
    public void setUp(int index, String imageName, boolean collision){
            UtilityTool uTool = new UtilityTool();
            try{
                tile[index] = new Tile();
                tile[index].image = ImageIO.read(getClass().getResourceAsStream("/tiles/" + imageName + ".png"));
                tile[index].image = uTool.scaleImage(tile[index].image, gp.tileSize, gp.tileSize);
                tile[index].collision = collision;
            }catch(IOException e){
                e.printStackTrace();
                System.out.println("tilemanager");
            }
            
        }
    

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;

        while (worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {

            int tileNum = mapTileNum[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = worldY - gp.player.worldY + gp.player.screenY;

            if (worldX + gp.tileSize > gp.player.worldX - gp.player.screenX
                    && worldX - gp.tileSize < gp.player.worldX + gp.player.screenX
                    && worldY + gp.tileSize > gp.player.worldY - gp.player.screenY
                    && worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {

                g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
            }

            worldCol++;

            if (worldCol == gp.maxWorldCol) {
                worldCol = 0;
                worldRow++;

            }

        }

    }
}
