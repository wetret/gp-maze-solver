package tree;

import java.util.List;


public interface IEvaluationNonTerminal {

    public List<IEvaluationNode> getChildren();

    public void setChild(int pPosition, IEvaluationNode pNewChild);

}
