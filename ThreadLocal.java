public static ThreadLocal getThreadLocal(Class cls, String fldname) {
    Field fld = null;
    boolean acs = false;
    try {
        fld = cls.getDeclaredField(fldname);
        acs = fld.isAccessible();
        fld.setAccessible(true);
        //class static field, a ThreadLocal
        return (ThreadLocal) fld.get(cls);
    } catch (java.lang.NoSuchFieldException ex) {
        throw SystemException.Aide.wrap(ex);
    } catch (java.lang.IllegalAccessException ex) {
        throw SystemException.Aide.wrap(ex);
    } finally {
        if (fld != null)
            //restore
            Fields.setAccessible(//restore
            fld, //restore
            acs);
    }
}

