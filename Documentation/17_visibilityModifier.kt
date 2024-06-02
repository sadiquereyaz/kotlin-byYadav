/*In a class, they let you hide your properties and methods from unauthorized access outside the class.
In a package, they let you hide the classes and interfaces from unauthorized access outside the package.

public. Default visibility modifier. Makes the declaration accessible everywhere.
The properties and methods that you want used outside the class are marked as public.

private. Makes the declaration accessible in the same class or source file.

protected. Makes the declaration accessible in subclasses. The properties and methods that you want used in the class
that defines them and the subclasses are marked with the protected visibility modifier.

internal. Makes the declaration accessible in the same module. The internal modifier is similar to private,
but you can access internal properties and methods from outside the class as long as
it's being accessed in the same module.

A package is like a directory or a folder that groups related classes,
whereas a module provides a container for your app's source code,
resource files, and app-level settings. A module can contain multiple packages.

If the visibility modifier for the getter function doesn't match
    with the visibility modifier for the property, the compiler reports an error.
*/