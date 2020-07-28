package com.outlook.heziyan418;

import java.util.ArrayList;
import java.util.List;

/**
 * weekly-contest-198, question num 1519
 * number-of-nodes-in-the-sub-tree-with-the-same-label
 * 使用了递归，复杂问题会运行超时
 */
class Solution2 {
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        char[] chars = labels.toCharArray();
        int[] rtnList = new int[n];
        Tree tree = new Tree(null, 0, chars[0]);
        tree.addTreeNode(edges, chars);

        for (int i = 0; i < n; i++) {
            Tree node = findNodeByNum(i, tree);
            rtnList[i] = countSame(node, node.getLabel(), 1);
        }
        return rtnList;
    }

    public Tree findNodeByNum(int num, Tree root) {
        if (root.getNum() == num) {
            return root;
        } else {
            for (Tree node : root.getNodes()) {
                Tree result = findNodeByNum(num, node);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    public int countSame(Tree root, char a, int sum) {
        for (Tree node : root.getNodes()) {
            sum = countSame(node, a, sum);
            if (node.getLabel() == a) {
                sum ++;
            }
        }
        return sum;
    }


    public class Tree{
        private List<Tree> nodes;
        private char label;
        private int num;
        private Tree parent;

        Tree(Tree parent, int num, char label) {
            this.parent = parent;
            this.num = num;
            this.label = label;
            this.nodes = new ArrayList<>();
        }

        public List<Tree> getNodes() {
            return nodes;
        }

        public void setNodes(List<Tree> nodes) {
            this.nodes = nodes;
        }

        public char getLabel() {
            return label;
        }

        public int getNum() {
            return num;
        }

        private void addTreeNode(int[][] edges, char[] chars) {
            for (int[] edge : edges) {
                if (edge[0] == num &&
                    (parent == null || parent.getNum() != edge[1])) {
                    Tree node = new Tree(this, edge[1], chars[edge[1]]);
                    nodes.add(node);
                    node.addTreeNode(edges, chars);
                } else if (edge[1] == num &&
                    (parent == null || parent.getNum() != edge[0])) {
                    Tree node = new Tree(this, edge[0], chars[edge[0]]);
                    nodes.add(node);
                    node.addTreeNode(edges, chars);
                }
            }
        }
    }
}