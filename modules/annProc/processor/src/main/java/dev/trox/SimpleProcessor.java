package dev.trox;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

public class SimpleProcessor extends AbstractProcessor
{
	@Override
	public Set<String> getSupportedAnnotationTypes ()
	{
		return Set.of( SimpleAnnotation.class.getName() );
	}

	@Override
	public SourceVersion getSupportedSourceVersion ()
	{
		return SourceVersion.latestSupported();
	}

	@Override
	public synchronized void init ( ProcessingEnvironment processingEnv )
	{
		processingEnv.getMessager().printMessage( Kind.WARNING, "SimpleProcessor was called!" );
	}

	@Override
	public boolean process ( Set<? extends TypeElement> annotations, RoundEnvironment roundEnv )
	{
		return false;
	}
}
