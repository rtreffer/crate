package crate.elasticsearch.action.parser;

import com.akiban.sql.parser.StatementNode;


/**
 * Data structure that is filled when calling
 * {@link SQLRequestParser#parseSource(SQLContext, org.elasticsearch.common.bytes.BytesReference)}
 */
public class SQLContext {

    /**
     * StatementNode is the top-level Node of the Syntax-Tree generated by the akiban SQL-Parser
     */
    private StatementNode statementNode;

    public SQLContext() {
        statementNode = null;
    }

    public void statementNode(StatementNode node) {
        this.statementNode = node;
    }

    public StatementNode statementNode() {
        return this.statementNode;
    }
}