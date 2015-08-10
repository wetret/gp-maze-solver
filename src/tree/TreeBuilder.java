package tree;


public class TreeBuilder {

    public TreeBuilder() {
    }

    public IMoveNode build() {
        return NodeBuilder.getMoveNode();
    }
}
