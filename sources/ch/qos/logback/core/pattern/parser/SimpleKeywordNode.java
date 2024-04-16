package ch.qos.logback.core.pattern.parser;

import java.util.List;
/* loaded from: classes.dex */
public class SimpleKeywordNode extends FormattingNode {
    List<String> optionList;

    /* JADX INFO: Access modifiers changed from: protected */
    public SimpleKeywordNode(int i, Object obj) {
        super(i, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof SimpleKeywordNode)) {
            return false;
        }
        List<String> list = this.optionList;
        List<String> list2 = ((SimpleKeywordNode) obj).optionList;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public List<String> getOptions() {
        return this.optionList;
    }

    @Override // ch.qos.logback.core.pattern.parser.FormattingNode, ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        return super.hashCode();
    }

    public void setOptions(List<String> list) {
        this.optionList = list;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        if (this.optionList == null) {
            sb = new StringBuilder();
            sb.append("KeyWord(");
            sb.append(this.value);
            sb.append(",");
            obj = this.formatInfo;
        } else {
            sb = new StringBuilder();
            sb.append("KeyWord(");
            sb.append(this.value);
            sb.append(", ");
            sb.append(this.formatInfo);
            sb.append(",");
            obj = this.optionList;
        }
        sb.append(obj);
        sb.append(")");
        sb2.append(sb.toString());
        sb2.append(printNext());
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleKeywordNode(Object obj) {
        super(1, obj);
    }
}
