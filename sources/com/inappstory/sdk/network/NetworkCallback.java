package com.inappstory.sdk.network;

import android.util.Log;
import com.inappstory.sdk.InAppStoryManager;
/* loaded from: classes3.dex */
public abstract class NetworkCallback<T> implements Callback<T> {
    protected void error402(String str) {
        Log.d(InAppStoryManager.IAS_ERROR_TAG, "Access was terminated. Check the management console for details.");
    }

    public void onError(int i, String str) {
        if (i != -1) {
            if (i != 415) {
                if (i != 418) {
                    if (i != 429) {
                        if (i != 500) {
                            if (i != 502) {
                                if (i != 409) {
                                    if (i != 410) {
                                        switch (i) {
                                            case 400:
                                                break;
                                            case 401:
                                                error401(str);
                                                return;
                                            case 402:
                                                error402(str);
                                                return;
                                            case 403:
                                                error403(str);
                                                return;
                                            case 404:
                                                error404(str);
                                                return;
                                            case 405:
                                                error405(str);
                                                return;
                                            default:
                                                switch (i) {
                                                    case 422:
                                                        error422(str);
                                                        return;
                                                    case 423:
                                                        error423(str);
                                                        return;
                                                    case 424:
                                                        error424(str);
                                                        return;
                                                    default:
                                                        errorDefault(str);
                                                        return;
                                                }
                                        }
                                    } else {
                                        error410(str);
                                        return;
                                    }
                                } else {
                                    error409(str);
                                    return;
                                }
                            } else {
                                error502(str);
                                return;
                            }
                        } else {
                            error500(str);
                            return;
                        }
                    } else {
                        error429(str);
                        return;
                    }
                } else {
                    error418(str);
                    return;
                }
            } else {
                error415(str);
                return;
            }
        } else {
            onTimeout();
        }
        error400(str);
    }

    @Override // com.inappstory.sdk.network.Callback
    public final void onFailure(Response response) {
        onError(response.code, response.errorBody);
    }

    public void onTimeout() {
    }

    protected void error400(String str) {
    }

    protected void error401(String str) {
    }

    protected void error403(String str) {
    }

    protected void error404(String str) {
    }

    protected void error405(String str) {
    }

    protected void error409(String str) {
    }

    protected void error410(String str) {
    }

    protected void error415(String str) {
    }

    protected void error418(String str) {
    }

    protected void error422(String str) {
    }

    protected void error423(String str) {
    }

    protected void error424(String str) {
    }

    protected void error429(String str) {
    }

    protected void error500(String str) {
    }

    protected void error502(String str) {
    }

    protected void errorDefault(String str) {
    }
}
