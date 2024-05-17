package top.mcmtr.mod;

import org.mtr.mapping.holder.Block;
import org.mtr.mapping.holder.Identifier;
import org.mtr.mapping.registry.BlockRegistryObject;
import top.mcmtr.mod.blocks.*;

public class Blocks {
    static {
        CATENARY_NODE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "catenary_node"), () -> new Block(new BlockCatenaryNode()), CreativeModeTabs.EXTERNAL);
        RIGID_CATENARY_NODE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "rigid_catenary_node"), () -> new Block(new BlockRigidCatenaryNode()), CreativeModeTabs.EXTERNAL);

        YAMANOTE_RAILWAY_SIGN_2_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_2_even"), () -> new Block(new BlockYamanoteRailwaySign(2, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_2_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_2_odd"), () -> new Block(new BlockYamanoteRailwaySign(2, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_3_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_3_even"), () -> new Block(new BlockYamanoteRailwaySign(3, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_3_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_3_odd"), () -> new Block(new BlockYamanoteRailwaySign(3, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_4_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_4_even"), () -> new Block(new BlockYamanoteRailwaySign(4, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_4_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_4_odd"), () -> new Block(new BlockYamanoteRailwaySign(4, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_5_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_5_even"), () -> new Block(new BlockYamanoteRailwaySign(5, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_5_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_5_odd"), () -> new Block(new BlockYamanoteRailwaySign(5, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_6_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_6_even"), () -> new Block(new BlockYamanoteRailwaySign(6, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_6_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_6_odd"), () -> new Block(new BlockYamanoteRailwaySign(6, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_7_EVEN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_7_even"), () -> new Block(new BlockYamanoteRailwaySign(7, false)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_7_ODD = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_7_odd"), () -> new Block(new BlockYamanoteRailwaySign(7, true)), CreativeModeTabs.STATION);
        YAMANOTE_RAILWAY_SIGN_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_railway_sign_pole"), () -> new Block(new BlockYamanoteRailwaySignPole()), CreativeModeTabs.STATION);

        YUUNI_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_pids"), () -> new Block(new BlockYuuniPIDS(2)), CreativeModeTabs.STATION);
        YUUNI_2_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_2_pids"), () -> new Block(new BlockYuuniPIDS(1)), CreativeModeTabs.STATION);
        YUUNI_PIDS_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_pids_pole"), () -> new Block(new BlockYuuniPIDSPole()), CreativeModeTabs.STATION);
        YAMANOTE_4_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_4_pids"), () -> new Block(new BlockYamanotePIDS(4)), CreativeModeTabs.STATION);
        YAMANOTE_5_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_5_pids"), () -> new Block(new BlockYamanotePIDS(5)), CreativeModeTabs.STATION);
        YAMANOTE_6_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_6_pids"), () -> new Block(new BlockYamanotePIDS(6)), CreativeModeTabs.STATION);
        YAMANOTE_7_PIDS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yamanote_7_pids"), () -> new Block(new BlockYamanotePIDS(7)), CreativeModeTabs.STATION);
        YUUNI_TICKET = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_ticket"), () -> new Block(new BlockYuuniTicket()), CreativeModeTabs.STATION);

        STANDING_SIGN = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_standing_sign"), () -> new Block(new BlockStandingSign()), CreativeModeTabs.EXTERNAL);
        STANDING_SIGN_1 = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_standing_sign_1"), () -> new Block(new BlockStandingSign1()), CreativeModeTabs.EXTERNAL);
        STANDING_SIGN_POLE = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "yuuni_standing_sign_pole"), () -> new Block(new BlockStandingSignPole()), CreativeModeTabs.EXTERNAL);

        SURVEILLANCE_CAMERAS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "surveillance_cameras"), () -> new Block(new BlockSurveillanceCameras()), CreativeModeTabs.STATION);
        HALL_SEAT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "hall_seat_middle"), () -> new Block(new BlockHallSeat()), CreativeModeTabs.STATION);
        DECORATION_BOOK = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_book"), () -> new Block(new BlockDecorationBook()), CreativeModeTabs.STATION);
        DECORATION_CEILING = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_ceiling"), () -> new Block(new BlockDecorationCeiling()), CreativeModeTabs.STATION);
        DECORATION_CEILING_LIGHT = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_ceiling_light"), () -> new Block(new BlockDecorationCeilingLight()), CreativeModeTabs.STATION);
        DECORATION_FLOOR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_floor"), () -> new Block(new BlockDecorationFloor()), CreativeModeTabs.STATION);
        DECORATION_PC = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_pc"), () -> new Block(new BlockDecorationPC()), CreativeModeTabs.STATION);
        DECORATION_STAIR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "decoration_stair"), () -> new Block(new BlockDecorationStair()), CreativeModeTabs.STATION);
        DISPLAY_BOARD_HORIZONTALLY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "display_board_horizontal"), () -> new Block(new BlockDisplayBoardHorizontally()), CreativeModeTabs.STATION);
        DISPLAY_BOARD_VERTICALLY = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "display_board_vertically"), () -> new Block(new BlockDisplayBoardVertically()), CreativeModeTabs.STATION);
        RAILING_STAIR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "railing_stair"), () -> new Block(new BlockRailingStair()), CreativeModeTabs.STATION);
        RAILING_STAIR_MIRROR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "railing_stair_mirror"), () -> new Block(new BlockRailingStair()), CreativeModeTabs.STATION);
        RAILING_STAIR_GLASS = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "railing_stair_glass"), () -> new Block(new BlockRailingStair()), CreativeModeTabs.STATION);
        RAILING_STAIR_GLASS_MIRROR = Init.REGISTRY.registerBlockWithBlockItem(new Identifier(Init.MOD_ID, "railing_stair_glass_mirror"), () -> new Block(new BlockRailingStair()), CreativeModeTabs.STATION);

        ELECTRIC_NODE = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "electric_node"), () -> new Block(new BlockCatenaryNode()));
        TRANS_CATENARY_NODE = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "trans_catenary_node"), () -> new Block(new BlockCatenaryNode()));
        CATENARY_NODE_STYLE_2 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "catenary_node_style_2"), () -> new Block(new BlockCatenaryNode()));
        SHORT_CATENARY_NODE = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "short_catenary_node"), () -> new Block(new BlockCatenaryNode()));
        SHORT_CATENARY_NODE_STYLE_2 = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "short_catenary_node_style_2"), () -> new Block(new BlockCatenaryNode()));
        YAMANOTE_RAILWAY_SIGN_MIDDLE = Init.REGISTRY.registerBlock(new Identifier(Init.MOD_ID, "yamanote_railway_sign_middle"), () -> new Block(new BlockYamanoteRailwaySign(0, false)));
    }

    public static final BlockRegistryObject CATENARY_NODE;
    public static final BlockRegistryObject RIGID_CATENARY_NODE;
    public static final BlockRegistryObject CATENARY_NODE_STYLE_2;
    public static final BlockRegistryObject SHORT_CATENARY_NODE;
    public static final BlockRegistryObject SHORT_CATENARY_NODE_STYLE_2;
    public static final BlockRegistryObject ELECTRIC_NODE;
    public static final BlockRegistryObject TRANS_CATENARY_NODE;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_2_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_2_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_3_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_3_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_4_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_4_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_5_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_5_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_6_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_6_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_7_EVEN;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_7_ODD;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_MIDDLE;
    public static final BlockRegistryObject YAMANOTE_RAILWAY_SIGN_POLE;
    public static final BlockRegistryObject YUUNI_PIDS;
    public static final BlockRegistryObject YUUNI_2_PIDS;
    public static final BlockRegistryObject YUUNI_PIDS_POLE;
    public static final BlockRegistryObject YAMANOTE_4_PIDS;
    public static final BlockRegistryObject YAMANOTE_5_PIDS;
    public static final BlockRegistryObject YAMANOTE_6_PIDS;
    public static final BlockRegistryObject YAMANOTE_7_PIDS;
    public static final BlockRegistryObject SURVEILLANCE_CAMERAS;
    public static final BlockRegistryObject STANDING_SIGN;
    public static final BlockRegistryObject STANDING_SIGN_1;
    public static final BlockRegistryObject STANDING_SIGN_POLE;
    public static final BlockRegistryObject YUUNI_TICKET;
    public static final BlockRegistryObject HALL_SEAT;
    public static final BlockRegistryObject DECORATION_BOOK;
    public static final BlockRegistryObject DECORATION_CEILING;
    public static final BlockRegistryObject DECORATION_CEILING_LIGHT;
    public static final BlockRegistryObject DECORATION_FLOOR;
    public static final BlockRegistryObject DECORATION_PC;
    public static final BlockRegistryObject DECORATION_STAIR;
    public static final BlockRegistryObject DISPLAY_BOARD_HORIZONTALLY;
    public static final BlockRegistryObject DISPLAY_BOARD_VERTICALLY;
    public static final BlockRegistryObject RAILING_STAIR;
    public static final BlockRegistryObject RAILING_STAIR_MIRROR;
    public static final BlockRegistryObject RAILING_STAIR_GLASS;
    public static final BlockRegistryObject RAILING_STAIR_GLASS_MIRROR;

    public static void init() {
        Init.MSD_LOGGER.info("Registering MTR Station Decoration blocks");
    }
}