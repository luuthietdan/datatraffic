package edu.data.generator.config;

public interface Config {
    String SOURCE_DIR = "./dataset/cartoon";
    String BACKGROUND_DIR = "./dataset/cartoon-backgrounds";
    String TARGET_DIR = "./dataset/output";
    String DATASET_DIR = "/VOCDataSet/";
    String IMAGES_DIR = "/JPEGImages/";
    String ANNOTATIONS_DIR = "/Annotations/";
    String DARKNET_LABELS = "/labels/";
    String DARKNET_CONFIG_DIR = "/DarknetConf/";
    String VOC_LABELS = "/VOCLabels/";
    Integer IMAGE_WIDTH = 416;
    Integer IMAGE_HEIGHT = 416;
    Integer ROWS = 2;
    Integer COLS = 2;
    Integer DATA_SET_SIZE = 5;
    Integer VAL_SET_SIZE = 5;
    Integer MARGIN_AROUND = 10; // 10px space around the playground
    Integer MARGIN_BETWEEN = 10; // 10px space between the cards
    Integer MAX_ANGLE_TO_ROTATE = 30;
    boolean BLUR = true;
    boolean DEBUG = true;
    boolean DARKNET = true; // Generates labels and train-val.txt for darknet
    String[] CLASS_LABELS = {"C� xe l?a ?i qua", "???ng h?p 2 b�n"};
}
