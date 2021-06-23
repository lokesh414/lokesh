private void verifyArrayFieldTypeAnnotations(Class c)
    throws NoSuchFieldException, NoSuchMethodException {

    Annotation anno;
    AnnotatedType at;

    at = c.getDeclaredField("typeAnnotatedArray").getAnnotatedType();
    anno = at.getAnnotations()[0];
    verifyTestAnn(arrayTA[0], anno, "array1");
    arrayTA[0] = anno;

    for (int i = 1; i <= 3; i++) {
        at = ((AnnotatedArrayType) at).getAnnotatedGenericComponentType();
        anno = at.getAnnotations()[0];
        verifyTestAnn(arrayTA[i], anno, "array" + (i + 1));
        arrayTA[i] = anno;
    }
}

