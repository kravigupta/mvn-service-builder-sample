package me.rkg.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link FooService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       FooService
 * @generated
 */
public class FooServiceWrapper implements FooService,
    ServiceWrapper<FooService> {
    private FooService _fooService;

    public FooServiceWrapper(FooService fooService) {
        _fooService = fooService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _fooService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _fooService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _fooService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public FooService getWrappedFooService() {
        return _fooService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedFooService(FooService fooService) {
        _fooService = fooService;
    }

    public FooService getWrappedService() {
        return _fooService;
    }

    public void setWrappedService(FooService fooService) {
        _fooService = fooService;
    }
}
