package com.morronel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        String path;
        List<List<Character>> listOfLists;
        List<Character> characterArrayList;
        int cores;

        cores = Runtime.getRuntime().availableProcessors();
        path = "/home/uucyc/Desktop/gli.zip";
        characterArrayList = Utils.characterListBuilder("-n");

        if (cores > characterArrayList.size()) {
            cores = characterArrayList.size();
        }

        listOfLists = Utils.splitArrayByThreadAmount(characterArrayList, cores);
        ExecutorService executorService = Executors.newFixedThreadPool(cores);

        for (List<Character> list : listOfLists) {
            executorService.submit(() -> {
                Verificator verificator = new Verificator(path);

                for (Character symbol : list) {
                    System.out.println(symbol.toString());
                    if (verificator.verify(symbol.toString())) {
                        System.out.println("The pass is " + symbol.toString());
                        Runtime.getRuntime().exit(0);
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        System.out.println(symbol1.toString() + symbol2.toString());
                        if (verificator.verify(symbol1.toString() + symbol2.toString())) {
                            System.out.println("The pass is " + symbol1.toString() + symbol2.toString());
                            Runtime.getRuntime().exit(0);
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString());
                            if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString())) {
                                System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString());
                                Runtime.getRuntime().exit(0);
                            }
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            for (Character symbol4 : characterArrayList) {
                                System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString());
                                if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString())) {
                                    System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString());
                                    Runtime.getRuntime().exit(0);
                                }
                            }
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            for (Character symbol4 : characterArrayList) {
                                for (Character symbol5 : characterArrayList) {
                                    System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString());
                                    if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString())) {
                                        System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString());
                                        Runtime.getRuntime().exit(0);
                                    }
                                }
                            }
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            for (Character symbol4 : characterArrayList) {
                                for (Character symbol5 : characterArrayList) {
                                    for (Character symbol6 : characterArrayList) {
                                        System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString());
                                        if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString())) {
                                            System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString());
                                            Runtime.getRuntime().exit(0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            for (Character symbol4 : characterArrayList) {
                                for (Character symbol5 : characterArrayList) {
                                    for (Character symbol6 : characterArrayList) {
                                        for (Character symbol7 : characterArrayList) {
                                            System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString());
                                            if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString())) {
                                                System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString());
                                                Runtime.getRuntime().exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                for (Character symbol1 : list) {
                    for (Character symbol2 : characterArrayList) {
                        for (Character symbol3 : characterArrayList) {
                            for (Character symbol4 : characterArrayList) {
                                for (Character symbol5 : characterArrayList) {
                                    for (Character symbol6 : characterArrayList) {
                                        for (Character symbol7 : characterArrayList) {
                                            for (Character symbol8 : characterArrayList) {
                                                System.out.println(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString() + symbol8.toString());
                                                if (verificator.verify(symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString() + symbol8.toString())) {
                                                    System.out.println("The pass is " + symbol1.toString() + symbol2.toString() + symbol3.toString() + symbol4.toString() + symbol5.toString() + symbol6.toString() + symbol7.toString() + symbol8.toString());
                                                    Runtime.getRuntime().exit(0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            });
        }
    }
}
