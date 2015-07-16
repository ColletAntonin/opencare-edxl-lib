# OpenCARE EDXL Library #

## How OpenCARE works? ##

The idea behind OpenCARE is simple.

  1. An OpenCARE node connects to information sources by mean of plug-in implementations.
    * Each information source has a plug-in which communicates with the source in its native format. This approach allows OpenCARE to talk to any kind of information source, without the need to change the source, as long as there is a plug-in for it.
    * Some information sources are one-way such as RSS/ATOM feed, website, weather earthquake or other alert, etc.
  1. Once information is fetched by a plug-in, it translates information into a general format, such as EDXL.
    * Conceptually, plug-ins work best by dealing with structured information because such information can be translated into XML easily.
    * Text in whatever encoding is translated into Unicode.
    * Other kind of information such as relevant picture or binary data can also be encapsulated into an XML structure by first translating it into base64 first.
  1. When the information native to the information source is translated into an XML-based general format, this information packet is then sent over to other OpenCARE nodes in the network.
  1. At a remote OpenCARE node, it translates a general XML-based format back into a native format that end-systems connecting to that node understand. This is done by mean of plug-ins.
    * Information received by end-systems through OpenCARE can be structurally different from the originating information.
    * This approach makes different systems talk together through OpenCARE in a straight-through processing fashion.

Here is an example of how System A disseminates information to Systems B, C, and D through OpenCARE.
  * System A, connecting to OpenCARE node N1, send data in Format A (native to System A).
  * Node N1 upon receiving such information by plug-in A then translates it into a general XML-based format.
  * Subsequently, node N1 broadcasts the translated XML information it has just received to other OpenCARE nodes.
  * OpenCARE node N2 upon receiving XML information from node N1:
    * it uses plug-in B to translate the received information for System B, into B's native format,
    * at the same time, it uses plug-in C to do the same for System C, in C's native format,
    * information received by B and C is the same information from A but structured differently because B and C are using different formats than A (different software).
  * System D, connected at OpenCARE node N3, also receives the same information as those connected to Node N2 above. But if System D is using the same software as System A, then node N3 will use plug-in A to talk to System D. Plug-ins are shared among OpenCARE nodes in the network.