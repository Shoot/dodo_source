package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;
/* loaded from: classes.dex */
public class FormattingNode extends Node {
    FormatInfo formatInfo;

    FormattingNode(int i) {
        super(i);
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof FormattingNode)) {
            return false;
        }
        FormatInfo formatInfo = this.formatInfo;
        FormatInfo formatInfo2 = ((FormattingNode) obj).formatInfo;
        if (formatInfo != null) {
            return formatInfo.equals(formatInfo2);
        }
        if (formatInfo2 != null) {
            return false;
        }
        return true;
    }

    public FormatInfo getFormatInfo() {
        return this.formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        FormatInfo formatInfo = this.formatInfo;
        if (formatInfo != null) {
            i = formatInfo.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public void setFormatInfo(FormatInfo formatInfo) {
        this.formatInfo = formatInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FormattingNode(int i, Object obj) {
        super(i, obj);
    }
}
