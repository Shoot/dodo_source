package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.subst.Token;
import java.util.List;
/* loaded from: classes.dex */
public class Parser {
    int pointer = 0;
    final List<Token> tokenList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.qos.logback.core.subst.Parser$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Token$Type;

        static {
            int[] iArr = new int[Token.Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Token$Type = iArr;
            try {
                iArr[Token.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.CURLY_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Parser(List<Token> list) {
        this.tokenList = list;
    }

    private Node C() throws ScanException {
        Node E = E();
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            E.append(makeNewLiteralNode(CoreConstants.DEFAULT_VALUE_SEPARATOR));
            E.append(E());
        }
        return E;
    }

    private Node E() throws ScanException {
        Node T = T();
        if (T == null) {
            return null;
        }
        Node Eopt = Eopt();
        if (Eopt != null) {
            T.append(Eopt);
        }
        return T;
    }

    private Node Eopt() throws ScanException {
        if (peekAtCurentToken() == null) {
            return null;
        }
        return E();
    }

    private Node T() throws ScanException {
        Token peekAtCurentToken = peekAtCurentToken();
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Token$Type[peekAtCurentToken.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                advanceTokenPointer();
                Node V = V();
                expectCurlyRight(peekAtCurentToken());
                advanceTokenPointer();
                return V;
            }
            advanceTokenPointer();
            Node C = C();
            expectCurlyRight(peekAtCurentToken());
            advanceTokenPointer();
            Node makeNewLiteralNode = makeNewLiteralNode(CoreConstants.LEFT_ACCOLADE);
            makeNewLiteralNode.append(C);
            makeNewLiteralNode.append(makeNewLiteralNode(CoreConstants.RIGHT_ACCOLADE));
            return makeNewLiteralNode;
        }
        advanceTokenPointer();
        return makeNewLiteralNode(peekAtCurentToken.payload);
    }

    private Node V() throws ScanException {
        Node node = new Node(Node.Type.VARIABLE, E());
        if (isDefaultToken(peekAtCurentToken())) {
            advanceTokenPointer();
            node.defaultPart = E();
        }
        return node;
    }

    private boolean isDefaultToken(Token token) {
        if (token != null && token.type == Token.Type.DEFAULT) {
            return true;
        }
        return false;
    }

    private Node makeNewLiteralNode(String str) {
        return new Node(Node.Type.LITERAL, str);
    }

    void advanceTokenPointer() {
        this.pointer++;
    }

    void expectCurlyRight(Token token) throws ScanException {
        expectNotNull(token, "}");
        if (token.type == Token.Type.CURLY_RIGHT) {
            return;
        }
        throw new ScanException("Expecting }");
    }

    void expectNotNull(Token token, String str) {
        if (token != null) {
            return;
        }
        throw new IllegalArgumentException("All tokens consumed but was expecting \"" + str + "\"");
    }

    public Node parse() throws ScanException {
        List<Token> list = this.tokenList;
        if (list != null && !list.isEmpty()) {
            return E();
        }
        return null;
    }

    Token peekAtCurentToken() {
        if (this.pointer < this.tokenList.size()) {
            return this.tokenList.get(this.pointer);
        }
        return null;
    }
}
