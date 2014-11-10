package org.jumpmind.symmetric.app.common.persist;

abstract public class AbstractPersistenceManager implements IPersistenceManager {

    protected RuntimeException toRuntimeException(Exception e) {
        if (e instanceof RuntimeException) {
            return (RuntimeException) e;
        } else {
            return new RuntimeException(e);
        }
    }
}
