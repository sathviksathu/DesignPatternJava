#FACADE PATTERN
###Best friend of abstraction

###Defination
Provides a simple, easy to understand user interface over
a large sophisticated, otherwise complex body of code.

###Why to use?
Purpose of facade is to simply provide a simplified interface,
because user may not be interested in a internal working of
subsytems. All he might sometimes need is:

segmentation = getSegmentation(image)

API consumers mostly are concerned with usability of API
and simplicity of API. 

To cater to such consumers, and also to show a sense of
friendliness Facade pattern can be used to hide all the complexity.

###When to use?
Having a Facade is handy when you need to integrate your app
with a sophisticated library that has dozens of features, but you just need 
a tiny bit of its functionality.

###Real World Analogies
When you call a shop to place a phone order, an operator is your facade to all services and departments of the shop. The operator provides you with a simple voice interface to the ordering system, payment gateways, and various delivery services.

###Trivia
Remember Facade does not reduce the compexity. It only hides it from external systems
and clients. SO primary benificiary of facade is cleint itself.

Facade doesn't aim to "encapsulate" subsystems. It still
allows client access to all subsystems(through it's purely facade
coder call). The client is still free to bypass Facade and
get his hands dirty dealing directly with low-level APIs.

###The subtle Differences (Adapter vs Facade)

Adapter makes use of an "existing", "client-knows" interface
to make a certain "system" or "service" even usable, which
otherwise is incompatible with client.

Facade doesn't solve such a problem, it purely exists to
"simplify" certain system. You can still work without
using Facade, your system will not break.

###Only One Facade Per Subsystem?
Not at all. We can create any number of Facades, over a 
subsystem to make the system easier to use.

###Challenges
1) Additional layer of coding
2) When the internal structure of subsystem changes,
you need to incorporate those changes in the facade layer also.
