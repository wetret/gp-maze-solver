package tree;

import java.util.List;


public interface INode {

    public String evaluationToString();
    public List<INode> getFlattenedTree();
    
    public INode getCopy();
}
