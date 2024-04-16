package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.JsonMappingException;
/* loaded from: classes2.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected final y85 d;
    protected transient fa0 e;
    protected transient ja0 f;

    protected InvalidDefinitionException(ob5 ob5Var, String str, y85 y85Var) {
        super(ob5Var, str);
        this.d = y85Var;
        this.e = null;
        this.f = null;
    }

    public static InvalidDefinitionException u(ua5 ua5Var, String str, fa0 fa0Var, ja0 ja0Var) {
        return new InvalidDefinitionException(ua5Var, str, fa0Var, ja0Var);
    }

    public static InvalidDefinitionException w(ua5 ua5Var, String str, y85 y85Var) {
        return new InvalidDefinitionException(ua5Var, str, y85Var);
    }

    public static InvalidDefinitionException x(ob5 ob5Var, String str, y85 y85Var) {
        return new InvalidDefinitionException(ob5Var, str, y85Var);
    }

    protected InvalidDefinitionException(ua5 ua5Var, String str, y85 y85Var) {
        super(ua5Var, str);
        this.d = y85Var;
        this.e = null;
        this.f = null;
    }

    protected InvalidDefinitionException(ua5 ua5Var, String str, fa0 fa0Var, ja0 ja0Var) {
        super(ua5Var, str);
        this.d = fa0Var == null ? null : fa0Var.m();
        this.e = fa0Var;
        this.f = ja0Var;
    }
}
