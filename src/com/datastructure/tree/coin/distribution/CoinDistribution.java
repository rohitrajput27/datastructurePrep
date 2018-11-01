package com.datastructure.tree.coin.distribution;

import java.util.ArrayList;
import java.util.List;

public class CoinDistribution {

    private CoinNode rootNode = null;

    public static void main(String[] args) {

        CoinDistribution coinDistribution = new CoinDistribution();
        coinDistribution.createTree();
        coinDistribution.printTree();
        coinDistribution.distributeCoin(coinDistribution.rootNode);
        coinDistribution.printTree();
    }

    private void createTree() {
        CoinNode node1 = new CoinNode(1,null);
        CoinNode node11 = new CoinNode(0,node1);
        CoinNode node12 = new CoinNode(1,node1);
        CoinNode node13 = new CoinNode(0,node1);
        CoinNode node21 = new CoinNode(3,node11);
//        CoinNode node22 = new CoinNode(1);
//        CoinNode node31 = new CoinNode(1);
        node1.getCoinNodes().add(node11);
        node1.getCoinNodes().add(node12);
        node1.getCoinNodes().add(node13);
        node11.getCoinNodes().add(node21);
//        node11.getCoinNodes().add(node22);
//        node21.getCoinNodes().add(node31);
        rootNode = node1;
    }

    private void printTree() {
        System.out.println(rootNode);
        printTree(rootNode.getCoinNodes());

    }

    private void printTree(List<CoinNode> coinNodes) {

        List<CoinNode> moreCoinNodes = new ArrayList<>();
        if (coinNodes != null && !coinNodes.isEmpty()) {
            for (CoinNode node1 : coinNodes) {
                System.out.print(node1 + " ");
                if (node1.getCoinNodes() != null && !node1.getCoinNodes().isEmpty()) {
                    moreCoinNodes.addAll(node1.getCoinNodes());
                }
            }
        }
        System.out.println();
        if (!moreCoinNodes.isEmpty()) {
            printTree(moreCoinNodes);
        }

    }

    private void distributeCoin(CoinNode node) {

//        if( node.getCoin()!=1)
//        {
//            if(null != node.getParentNode() && node.getParentNode().getCoin() <1)
//            {
//                // give it to parent
//                node.getParentNode().setCoin(1);
//                node.setCoin(node.getCoin() -1);
//            }
//            else
//            {
//                // distribute to child
//                    if(null != node.getCoinNodes() && !node.getCoinNodes().isEmpty()) {
//                        for (CoinNode node1 : node.getCoinNodes()) {
//                            distributeCoin(node1);
//                            node1.setCoin(node1.getCoin() + 1);
//                            node.setCoin(node.getCoin() - 1);
//                        }
//                    }
//                    else
//                    {
//                        //steal from parent
//
//                    }
//
//            }
//        }
//        else
//        {
//            for(CoinNode node1 : node.getCoinNodes())
//            {
//                distributeCoin(node1);
//            }
//        }

    }
}
