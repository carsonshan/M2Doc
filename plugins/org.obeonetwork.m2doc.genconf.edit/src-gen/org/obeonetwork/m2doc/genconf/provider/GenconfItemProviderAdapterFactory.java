/**
 */
package org.obeonetwork.m2doc.genconf.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.obeonetwork.m2doc.genconf.util.GenconfAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class GenconfItemProviderAdapterFactory extends GenconfAdapterFactory
        implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public GenconfItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.Generation} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected GenerationItemProvider generationItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.Generation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createGenerationAdapter() {
        if (generationItemProvider == null) {
            generationItemProvider = new GenerationItemProvider(this);
        }

        return generationItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.ModelDefinition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ModelDefinitionItemProvider modelDefinitionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.ModelDefinition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createModelDefinitionAdapter() {
        if (modelDefinitionItemProvider == null) {
            modelDefinitionItemProvider = new ModelDefinitionItemProvider(this);
        }

        return modelDefinitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.StringDefinition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected StringDefinitionItemProvider stringDefinitionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.StringDefinition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createStringDefinitionAdapter() {
        if (stringDefinitionItemProvider == null) {
            stringDefinitionItemProvider = new StringDefinitionItemProvider(this);
        }

        return stringDefinitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.IntegerDefinition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IntegerDefinitionItemProvider integerDefinitionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.IntegerDefinition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createIntegerDefinitionAdapter() {
        if (integerDefinitionItemProvider == null) {
            integerDefinitionItemProvider = new IntegerDefinitionItemProvider(this);
        }

        return integerDefinitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.RealDefinition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RealDefinitionItemProvider realDefinitionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.RealDefinition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createRealDefinitionAdapter() {
        if (realDefinitionItemProvider == null) {
            realDefinitionItemProvider = new RealDefinitionItemProvider(this);
        }

        return realDefinitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.BooleanDefinition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected BooleanDefinitionItemProvider booleanDefinitionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.BooleanDefinition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createBooleanDefinitionAdapter() {
        if (booleanDefinitionItemProvider == null) {
            booleanDefinitionItemProvider = new BooleanDefinitionItemProvider(this);
        }

        return booleanDefinitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link org.obeonetwork.m2doc.genconf.Option} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected OptionItemProvider optionItemProvider;

    /**
     * This creates an adapter for a {@link org.obeonetwork.m2doc.genconf.Option}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter createOptionAdapter() {
        if (optionItemProvider == null) {
            optionItemProvider = new OptionItemProvider(this);
        }

        return optionItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    public void dispose() {
        if (generationItemProvider != null)
            generationItemProvider.dispose();
        if (modelDefinitionItemProvider != null)
            modelDefinitionItemProvider.dispose();
        if (stringDefinitionItemProvider != null)
            stringDefinitionItemProvider.dispose();
        if (integerDefinitionItemProvider != null)
            integerDefinitionItemProvider.dispose();
        if (realDefinitionItemProvider != null)
            realDefinitionItemProvider.dispose();
        if (booleanDefinitionItemProvider != null)
            booleanDefinitionItemProvider.dispose();
        if (optionItemProvider != null)
            optionItemProvider.dispose();
    }

}
